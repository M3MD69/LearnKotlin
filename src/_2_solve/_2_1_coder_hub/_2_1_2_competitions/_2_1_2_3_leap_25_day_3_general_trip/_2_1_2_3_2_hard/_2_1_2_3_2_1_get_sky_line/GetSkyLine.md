# <div dir="rtl">كشف الخطوط الخارجية للشبكات</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
في قلب مؤتمر بلاك هات للأمن السيبراني، تتحداك خوارزمية جديدة تُحاكي رسم الأفق الإلكتروني لعالم البيانات الهائل. تخيّل أن جميع الشبكات الإلكترونية في العالم تشكّل مدينة مترامية الأطراف، وكل شبكة هي بمثابة مبنى يرتفع ليشكل أفقًا رقميًا. مهمتك؟ تصميم نظام يحدد "أفق البيانات" - الخطوط الخارجية التي تمثل أبرز سمات هذه الشبكات.

تتدفق التهديدات الإلكترونية والبيانات المشفّرة من كل زاوية، وتحتاج إلى كشف "النقاط الرئيسية" التي تحدد معالم هذا الأفق. هذه النقاط هي المفتاح لفهم المواقع الأكثر تأثيرًا وتأمين الأنظمة بشكل فعال.

لديك مجموعة من الشبكات (المباني)، كل شبكة تحتوي على:

نقطة البداية (الإحداثي الأفقي الأول).

نقطة النهاية (الإحداثي الأفقي الأخير).

ارتفاع الشبكة (التأثير أو القوة الإلكترونية).

المطلوب:

تحليل هذه البيانات.

استخراج النقاط التي تشكل "الأفق" الرقمي للشبكات.

القواعد:

النقاط المفتاحية تحدد التغييرات في الأفق (ارتفاع جديد، أو انخفاض إلى الصفر).

النقاط المتكررة أو ذات الارتفاع المتماثل يجب دمجها لتجنب الضوضاء.

</b>
</li>
</ul>

---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
buildings = [2 ,9 ,10 ,3 ,7 ,15 ,5 ,12 ,12 ,15 ,20 ,10 ,19 ,24 ,8]
```

#### <div dir="rtl">المُخرجات</div>

```text
[2 ,10 ,3 ,15 ,7 ,12 ,12 ,0 ,15 ,10 ,20 ,8 ,24 ,0]
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
buildings = [0 ,2 ,3 ,2 ,5 ,3]
```

#### <div dir="rtl">المُخرجات</div>

```text
[0 ,3 ,5 ,0]
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
buildings = [1 ,2 ,1 ,1 ,2 ,2 ,1 ,2 ,3]
```

#### <div dir="rtl">المُخرجات</div>

```text
[1 ,3 ,2 ,0]
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
buildings = [1 ,3 ,3 ,2 ,4 ,4 ,5 ,6 ,1]
```

#### <div dir="rtl">المُخرجات</div>

```text
[1 ,3 ,2 ,4 ,4 ,0 ,5 ,1 ,6 ,0]
```