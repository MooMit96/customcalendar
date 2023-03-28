안녕하세요 김동현입니다. 아래의 CustomCalendar GuideLine을 참고해주세요.

# Custom Calendar SDK Setting

## app단 build.gradle 

implementation 'com.github.MooMit96:customcalendar:SDK_VERSION' 

## setting.gradle 

   dependencyResolutionManagement > repositories 안에 아래의 내용을 추가해줍니다.
  
        google()
        mavenCentral()
        maven {url 'https://jitpack.io'

# Use CustomCalendar

 CalendarView 는 XML File  / Class 동적 생성 모두 가능합니다.

## CalendarView 속성
setTopbarVisible( boolean )  : CalendarView의 Month Default 표출 유무에 대해 커스터마이징 할 수 있습니다.
addDecorators(class) : CalendarView에 Decorator를 사용자가 원하는 스타일에 맞게 커스터마이징 할 수 있습니다. ( 업데이트 예정 )


# Example Result
해당 SDK를 사용하면 최종적으로 다음과 같은 결과물을 얻을 수 있습니다.



![calendar_1](https://user-images.githubusercontent.com/106223157/228092841-c9ba8c24-22cf-43a4-8e1a-75a668ce1e7f.PNG)



![calendar_2](https://user-images.githubusercontent.com/106223157/228092844-07dbf75c-16d9-427c-af1f-8bd79a506beb.PNG)





