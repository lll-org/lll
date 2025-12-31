package top.lll44556.lll.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName menu
 */
@TableName(value ="menu")
@Data
public class Menu implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 上级菜单id
     */
    private Long menuPid;

    /**
     * 所有的父菜单id
     */
    private String menuPids;

    /**
     * 0：不是叶子节点，1：是叶子节点
     */
    private Integer isLeaf;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 地址
     */
    private String url;

    /**
     * 图标名称，比如element-plus中的图标名称
     */
    private String icon;

    /**
     * 同级菜单显示时的顺序
     */
    private Integer sort;

    /**
     * 菜单层级
     */
    private Integer level;

    /**
     * 是否禁用？1：启用，0：禁用
     */
    private Integer status;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}