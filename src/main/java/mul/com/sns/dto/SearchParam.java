package mul.com.sns.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchParam {

	private String search;
	private String category;
	
	private int page;
	private int startPage;
	private int endPage;
}
