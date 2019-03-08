package dto;

/**
 * @author zyl
 */
public class ResponseMapper {
    private ResponseMapper() {
    }

    /**
     * success
     *
     * @param e
     * @param <E>
     * @return
     */
    public static <E> RestfulResponse<E> ok(E e) {
        return new RestfulResponse<>(RestfulResponse.SUCCESS_CODE, RestfulResponse.SUCCESS_MESSAGE, e);
    }

    public static RestfulResponse ok() {
        return new RestfulResponse<>(RestfulResponse.SUCCESS_CODE, RestfulResponse.SUCCESS_MESSAGE);
    }
}
