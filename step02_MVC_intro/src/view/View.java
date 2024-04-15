package view;

import controller.Controller;

public class View {

	public static void main(String[] args) {
		// 입력 -> Controller -> Model -> Controller -> 출력
		String result = Controller.getTodayWeather("서울 중구");
		System.out.println(result);
	}

}
