LÀM ĐI
- Hỏi đáp: facebook.com/luongtopp 
- Làm ơn ủng hộ tôi một đăng ký youtube youtube.com/channel/luongtopp
- Nội dung học được:
+ Livedata
+ Cách thêm phương thức tiếp nhận dữ liệu để quan sát các thay đổi trong LiveData.
 <data>
   <variable
       name="gameViewModel"
       type="com.example.android.unscramble.ui.game.GameViewModel" />
 </data>
+ Talkback
val currentScrambledWord: LiveData<Spannable> = Transformations.map(_currentScrambledWord) {
  if (it == null) {
  SpannableString("")
  } else {
  val scrambledWord = it.toString()
  val spannable: Spannable = SpannableString(scrambledWord)
  spannable.setSpan(
  TtsSpan.VerbatimBuilder(scrambledWord).build(),
  0,
  scrambledWord.length,
  Spannable.SPAN_INCLUSIVE_INCLUSIVE
  )
  spannable
  }
  }