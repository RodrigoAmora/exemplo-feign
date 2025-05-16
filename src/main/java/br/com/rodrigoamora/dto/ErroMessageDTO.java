package br.com.rodrigoamora.dto;

import java.time.ZonedDateTime;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ErroMessageDTO {

	@JsonProperty("code")
	private Long code;
	
	@JsonProperty("user_message")
	private String userMessage;
	
	@JsonProperty("internal_message")
	private String internalMessage;
	
	@JsonProperty("more_info")
	private String moreInfo;
	
	@JsonProperty("date_time")
	@JsonFormat(shape = JsonFormat.Shape.NUMBER_INT)
	private Date dateTime;
	
	public static ErroMessageDTO build(Long code, String msg) {
		return ErroMessageDTO.builder()
				.code(code)
				.userMessage(msg)
				.internalMessage("")
				.moreInfo("")
				.dateTime(Date.from(ZonedDateTime.now().toInstant()))
				.build();
	}
}
