package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

/**
 * @author zyl
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Pagination<T> {
    private int total;

    private List<T> rows;
}
