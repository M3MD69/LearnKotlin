# <div dir="rtl">أفضل وقت لشراء وبيع الأسهم</div>

## <div dir="rtl">السؤال</div>

<ul dir="rtl">
<li>
<b>
وصف التحدي أُعطيت مصفوفة prices حيث أن prices[i] هي سعر سهم معين في اليوم ( i ) ،. الهدف هو إيجاد الربح الأقصى الذي يمكن تحقيق ه من خلال إجراء ما لا يزيد عن تعاملين بيع وشراء . تذكر أنه لا يمكن إجراء عدة عمليات بيع وشراء في نفس الوقت (أي يجب بيع السهم قبل شرائه مرة أخرى).
</b>
</li>
<li>
<b>
مثال:
<br/>
الإدخال: prices = [3, 3, 5, 0, 0, 3, 1, 4]
<br/>
الإخراج: 6
</b>
</li>
<li>
<b>
الشرح: يمكن شراء السهم في اليوم الرابع بسعر. 0 وبيعه في اليوم السادس بسعر 3 (ربح أول = 3)، ثم شراء السهم مرة أخرى في اليوم السابع بسعر 1 وبيعه في اليوم الثامن بسعر 4 (ربح ثاني = 3)، الربح الكلي = 3 + 3 = 6.
</b>
</li>
</ul>
---

## <div dir="rtl">المخرجات المتوقعة</div>

### <div dir="rtl">اختبار 1</div>

#### <div dir="rtl">المُدخلات</div>

```text
prices = [3, 3, 5, 0, 0, 3, 1, 4]
```

#### <div dir="rtl">المُخرجات</div>

```text
6
```

### <div dir="rtl">اختبار 2</div>

#### <div dir="rtl">المُدخلات</div>

```text
prices = [1, 2, 3, 4, 5]
```

#### <div dir="rtl">المُخرجات</div>

```text
4
```

### <div dir="rtl">اختبار 3</div>

#### <div dir="rtl">المُدخلات</div>

```text
prices = [1, 4, 2, 5]
```

#### <div dir="rtl">المُخرجات</div>

```text
6
```

### <div dir="rtl">اختبار 4</div>

#### <div dir="rtl">المُدخلات</div>

```text
prices = [1, 2, 3, 4, 5]
```

#### <div dir="rtl">المُخرجات</div>

```text
4
```