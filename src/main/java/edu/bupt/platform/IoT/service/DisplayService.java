package edu.bupt.platform.IoT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bupt.platform.IoT.data.mapper.DeviceMapper;
import edu.bupt.platform.IoT.data.obj.Device;
import edu.bupt.platform.IoT.data.obj.HistoryInfo;
import edu.bupt.platform.IoT.data.obj.Statistics;

/**
* @author:mc 
* @Email:983771387@qq.com
* @version: V1.0.0 
* @createTime：2017年8月17日 下午9:30:00
* @introduction:
*/

@Service
public class DisplayService extends BaseService {

	@Autowired
	DeviceMapper deviceMapper;
	
	public Device getDetailBydeviceId(Long id) {
		// TODO Auto-generated method stub
		return deviceMapper.getById(id.intValue());
	}

	public HistoryInfo getHistoryBydeviceId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Statistics getStatistics() {
		// TODO Auto-generated method stub
		return null;
	}

}
