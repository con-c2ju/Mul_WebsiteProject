package mul.com.sns.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import mul.com.sns.dto.SearchParam;

@Mapper
@Repository
public interface AdminDao {

	// 주문목록
	List<Object> getDeleveryList(SearchParam param);
	int getDeleveryCount(SearchParam param);
	void changeDeliveryStatus();
	
	List<Object> getAllProduct();
	List<Object> getSearchProduct(String search);
	
	
}
