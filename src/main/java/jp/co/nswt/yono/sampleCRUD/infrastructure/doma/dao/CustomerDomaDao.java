package jp.co.nswt.yono.sampleCRUD.infrastructure.doma.dao;

import jp.co.nswt.yono.sampleCRUD.infrastructure.doma.entity.CustomerDomaEntity;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@ConfigAutowireable
@Dao
public interface CustomerDomaDao {
	@Select
	List<CustomerDomaEntity> selectAll();

	@Select
	CustomerDomaEntity selectById(int id);

	@Insert
	int insert(CustomerDomaEntity entity);

	@Update
	int update(CustomerDomaEntity entity);

	@Delete
	int delete(CustomerDomaEntity entity);
}
