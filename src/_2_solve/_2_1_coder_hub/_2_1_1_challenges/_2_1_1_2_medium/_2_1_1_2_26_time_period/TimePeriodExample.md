# <div dir="rtl">الفترة الزمنية</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
قم بكتابة function تستقبل تاريخين على شكل string يمثل التاريخ الأول تاريخ البداية ويمثل التاريخ الثاني تاريخ النهاية وتقوم الدالة بإرجاع القيمة True في حال كان التاريخين المُدخلين صحيحين وتقوم بإرجاع القيمة False في حال كان التاريخين المدخلين أو أحدهما خاطئ، وذلك حسب الشروط التالية: ١. يجب أن لا يكون تاريخ البداية يسبق تاريخ الانتهاء ٢. يجب أن يكون تاريخ البداية والنهاية قبل تاريخ اليوم ٣. صيغة التواريخ المُمررة للدالة تكون بصيغة نصية مكونة من تاريخ ووقت
</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
date1 = 2017-08-02T00:00:00
date2 = 2017-08-08T00:00:00
```

#### <div dir="rtl">المُخرجات</div>

```text
true
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
date1 = 2023-08-02T00:00:00
date2 = 2017-08-08T00:00:00
```

#### <div dir="rtl">المُخرجات</div>

```text
false
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
date1 = 2079-08-02T00:00:00
date2 = 2089-08-19T00:00:00
```

#### <div dir="rtl">المُخرجات</div>

```text
false
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
date1 = 2022-01-02T00:00:00
date2 = 2022-01-12T00:00:00
```

#### <div dir="rtl">المُخرجات</div>

```text
true
```