package top.lll44556.lll.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName external_account
 */
@TableName(value ="external_account")
@Data
public class ExternalAccount implements Serializable {
    /**
     * 外部账号id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 关联的本地账号id
     */
    private Long userId;

    /**
     * 外部身份提供者
     */
    private String provider;

    /**
     * 扩展字段（头像，昵称，邮箱等）
     */
    private Object extraJson;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}