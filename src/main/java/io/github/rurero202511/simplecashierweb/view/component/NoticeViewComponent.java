package io.github.rurero202511.simplecashierweb.view.component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.time.LocalDateTime;

/**
 * お知らせ ItemView
 */
@Value
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class NoticeViewComponent {

    /**
     * 掲載された日時
     */
    LocalDateTime publishedDateTime;

    /**
     * お知らせ文言
     */
    String noticeText;
}
