/**
 * 
 */
package ECS_Goods.mapper;

import org.apache.ibatis.annotations.Mapper;

import ECS_Goods.entity.goodsSkillActivity;

/**
 * @author yueqiulin
 *
 */
@Mapper
public interface goodsSkillMapper {
	   public int addGoodsSkillActivity(goodsSkillActivity gsa);
}
