package kh.spring.dto;

public class KakaoProfile {

	public Integer id;
	public String connected_at;
	public Properties properties;
	public Kakao_account kakao_account;

	public class Kakao_account {

		public Boolean profile_nickname_needs_agreement;
		public Boolean profile_image_needs_agreement;
		public Profile profile;
		public Boolean has_email;
		public Boolean email_needs_agreement;
		public Boolean is_email_valid;
		public Boolean is_email_verified;
		public String email;
		public Boolean has_age_range;
		public Boolean age_range_needs_agreement;
		public String age_range;
		public Boolean has_gender;
		public Boolean gender_needs_agreement;
		public String gender;

		public class Profile {

			public String nickname;
			public String thumbnail_image_url;
			public String profile_imageUrl;
			public Boolean is_default_image;
		}
	}

	public class Properties {

		public String nickname;
		public String profile_image;
		public String thumbnail_image;
	}
}
