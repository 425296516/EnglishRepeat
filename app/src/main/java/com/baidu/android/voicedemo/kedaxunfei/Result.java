/**
 * 
 */
package com.baidu.android.voicedemo.kedaxunfei;


import com.baidu.android.voicedemo.kedaxunfei.entity.Sentence;

import java.util.ArrayList;

/**
 * <p>Title: Result</p>
 * <p>Description: 评测结果</p>
 * <p>Company: www.iflytek.com</p>
 * @author iflytek
 * @date 2015年1月12日 下午4:58:38
 */
public class Result {
	/**
	 * 评测语种：en（英文）、cn（中文）
	 */
	public String language;
	/**
	 * 评测种类：read_syllable（cn单字）、read_word（词语）、read_sentence（句子） 
	 */
	public String category;
	/**
	 * 开始帧位置，每帧相当于10ms
	 */
	public int beg_pos;
	/**
	 * 结束帧位置
	 */
	public int end_pos;
	/**
	 * 评测内容
	 */
	public String content;
	/**
	 * 总得分
	 */
	public float total_score;
	/**
	 * 时长（cn）
	 */
	public int time_len;
	/**
	 * 异常信息（en）
	 */
	public String except_info;
	/**
	 * 是否乱读（cn）
	 */
	public boolean is_rejected;
	/**
	 * xml结果中的sentence标签
	 */
	public ArrayList<Sentence> sentences;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getBeg_pos() {
		return beg_pos;
	}

	public void setBeg_pos(int beg_pos) {
		this.beg_pos = beg_pos;
	}

	public int getEnd_pos() {
		return end_pos;
	}

	public void setEnd_pos(int end_pos) {
		this.end_pos = end_pos;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getTotal_score() {
		return total_score;
	}

	public void setTotal_score(float total_score) {
		this.total_score = total_score;
	}

	public int getTime_len() {
		return time_len;
	}

	public void setTime_len(int time_len) {
		this.time_len = time_len;
	}

	public String getExcept_info() {
		return except_info;
	}

	public void setExcept_info(String except_info) {
		this.except_info = except_info;
	}

	public boolean is_rejected() {
		return is_rejected;
	}

	public void setIs_rejected(boolean is_rejected) {
		this.is_rejected = is_rejected;
	}

	public ArrayList<Sentence> getSentences() {
		return sentences;
	}

	public void setSentences(ArrayList<Sentence> sentences) {
		this.sentences = sentences;
	}

	@Override
	public String toString() {
		return "Result{" +
				"language='" + language + '\'' +
				", category='" + category + '\'' +
				", beg_pos=" + beg_pos +
				", end_pos=" + end_pos +
				", content='" + content + '\'' +
				", total_score=" + total_score +
				", time_len=" + time_len +
				", except_info='" + except_info + '\'' +
				", is_rejected=" + is_rejected +
				", sentences=" + sentences +
				'}';
	}
}
