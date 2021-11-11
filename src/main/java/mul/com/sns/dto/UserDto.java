package mul.com.sns.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

	int seq;
	
	String email;
	String pwd;
	
	String nickname;
	
	String created_at;
	String avatar;
	
	int auth;
	
	boolean sns_only;
	
	String token;
}
