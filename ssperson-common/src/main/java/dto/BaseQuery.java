package dto;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zyl
 */
@Data
public abstract class BaseQuery {
    private Integer size;

    private Integer current;

    private List<String> descs = new ArrayList<>();

    public <T> Page<T> buildPage() {
        Page<T> page = new Page<>(this.current, this.size);
        if (descs.size() > 0) {
            page.setDescs(descs);
        }
        return page;
    }

    /**
     * build query wrapper
     *
     * @return
     */
    public abstract Wrapper<?> getWrapper();
}
