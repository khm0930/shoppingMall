package goorm.server.timedeal.dto;

import static goorm.server.timedeal.model.enums.MessageType.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import goorm.server.timedeal.model.TimeDeal;
import goorm.server.timedeal.model.enums.MessageType;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

public record SQSTimeDealDTO(
	Long time_deal_id,
	Long user_id,
	int quantity,
	String status
) {
}


// @Getter @Setter
// public class SQSTimeDealDTO {
//
// 	private MessageType messageType;
//
// 	private Long timeDealId;
// 	private Long userId;
// 	private String username;
//
// 	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
// 	private LocalDateTime startTime;
//
// 	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
// 	private LocalDateTime endTime;
//
// 	private Integer discountPrice;
// 	private Double discountPercentage;
// 	private LocalDateTime deletedAt;
// 	private String status;
// 	private Integer stockQuantity;
//
// 	public SQSTimeDealDTO(TimeDeal timeDeal) {
// 		this.messageType = messageType;
// 		this.timeDealId = timeDeal.getTimeDealId();
// 		this.userId = timeDeal.getUser().getUserId();
// 		this.username = timeDeal.getUser().getUsername();
// 		this.startTime = timeDeal.getStartTime();
// 		this.endTime = timeDeal.getEndTime();
// 		this.discountPrice = timeDeal.getDiscountPrice();
// 		this.discountPercentage = timeDeal.getDiscountPercentage();
// 		this.deletedAt = timeDeal.getDeletedAt();
// 		this.status = timeDeal.getStatus().name();
// 		this.stockQuantity = timeDeal.getStockQuantity();
// 	}
//
// 	public SQSTimeDealDTO() {
// 	}
// }
