package edu.bupt.platform.IoT.api;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.List;

import org.apache.log4j.Logger;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.DefaultBlockParameterNumber;
import org.web3j.protocol.core.methods.request.Transaction;
import org.web3j.protocol.core.methods.response.EthAccounts;
import org.web3j.protocol.core.methods.response.EthBlock;
import org.web3j.protocol.core.methods.response.EthBlockNumber;
import org.web3j.protocol.core.methods.response.EthCoinbase;
import org.web3j.protocol.core.methods.response.EthGetBalance;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.protocol.core.methods.response.EthTransaction;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

public class BlockchainAPI {
	protected final Logger logger = Logger.getLogger(this.getClass());
	
	static String baseUrl = "http://localhost:8545/";
	static Web3j web3 = Web3j.build(new HttpService(baseUrl));
	
	public static String SendTransaction(String data) throws IOException {
		String createAccount = "0x3b9a7c79514a90f8b7e632e4da11efb04daad166";
		Transaction transaction = new Transaction(createAccount, new BigInteger("16000"),
				new BigInteger("20000000000"), new BigInteger("4300000"), null, new BigInteger("0"), data);
		EthSendTransaction trans = web3.ethSendTransaction(transaction).send();
		return trans.getTransactionHash();
	}
	
	public static String getTransactionDateByHash (String Hash) throws IOException {
		if (Hash != null) {
			EthTransaction ethTransaction = web3.ethGetTransactionByHash(Hash).send();
			return ethTransaction.getResult().getInput();
		}
		return null;
	}
	
	
	
	public static void TestBaseInfo() throws IOException {

		System.out.println("-------------------------------");

		Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().send();
		System.out.println("客户端信息：" + web3ClientVersion.getWeb3ClientVersion());

		EthCoinbase ethCoinbase = web3.ethCoinbase().send();
		System.out.println("挖矿账户地址：" + ethCoinbase.getAddress());

		EthAccounts accounts = web3.ethAccounts().send();
		List<String> accountHashs = accounts.getAccounts();
		for (String accountHash : accountHashs) {
			System.out.println("账户：" + accountHash);
			EthGetBalance ethGetBalance = web3.ethGetBalance(accountHash, DefaultBlockParameterName.LATEST).send();
			System.out.println("余额：" + ethGetBalance.getBalance());
		}

		System.out.println("-------------------------------");
	}

	public static void TestReadALLTransaction() throws IOException {
		EthBlockNumber ethBlockNumber = web3.ethBlockNumber().send();
		System.out.println(ethBlockNumber.getBlockNumber());

		for (BigInteger i = new BigInteger("1"); i.compareTo(ethBlockNumber.getBlockNumber()) <= 0; i = i
				.add(new BigInteger("1"))) {
			EthBlock ethBlock = web3.ethGetBlockByNumber(new DefaultBlockParameterNumber(i), true).send();
			if(!ethBlock.getResult().getTransactions().isEmpty()) {
				System.out.println(i.toString());
			}
			
			// System.out.println(i.toString() + "---" +ethBlock.getResult().getHash() +
			// "---" + ethBlock.getResult().getTransactions());
			sendToFile(i.toString() + "---" + ethBlock.getResult().getHash() + "---"
					+ ethBlock.getResult().getTransactions());
		}
	}
	
	public static void ReadBlock(String number) throws IOException {
		EthBlock ethBlock = web3.ethGetBlockByNumber(new DefaultBlockParameterNumber(new BigInteger(number)), true).send();
		System.out.println(ethBlock.getResult().getHash() + "---" + ethBlock.getResult().getTransactions());
	}
	
	public static void ReadTransaction(String Hash) throws IOException {
		EthTransaction ethTransaction = web3.ethGetTransactionByHash(Hash).send();
		System.out.println(ethTransaction.getTransaction());
	}
	
	
	public static void sendToFile(String send) throws IOException {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("out.txt", true)));
		out.write(send + "\n");
		out.close();
	}
}
