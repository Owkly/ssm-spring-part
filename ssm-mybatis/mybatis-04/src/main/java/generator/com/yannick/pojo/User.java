package generator.com.yannick.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @TableName user
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private static final long serialVersionUID = 1L;
}