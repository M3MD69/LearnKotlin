# <div dir="rtl">نافذة الأسرار</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
في أعماق شبكة مليئة بالبيانات، يوجد نص طويل يحتوي على شيفرة خفية مطابقة لنمط معين. مهمتك هي استخراج أصغر نافذة من النص تحتوي على كل عناصر النمط المطلوب.

التحدي ليس بسيطًا، فالوقت يداهمك، والنص يتغير بسرعة. خوارزميتك ستكون مفتاحك الوحيد لفك هذا اللغز وكشف الأسرار. هل يمكنك تصميم الحل الأمثل قبل أن تُغلق النافذة على الأبد؟

مثال :
الادخال :

"name": "s",

"value": "abcabdebac"

الاخراج :

"cab"

</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
s = "ADOBECODEBANC"
t = "ABC"
```

#### <div dir="rtl">المُخرجات</div>

```text
"BANC"
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
s = "a"
t = "a"
```

#### <div dir="rtl">المُخرجات</div>

```text
"a"
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
s = "a"
t = "aa"
```

#### <div dir="rtl">المُخرجات</div>

```text
""
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
s = "abdabca"
t = "abc"
```

#### <div dir="rtl">المُخرجات</div>

```text
"abc"
```