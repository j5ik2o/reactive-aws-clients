// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstanceRecurrenceBuilderOps(val self: ScheduledInstanceRecurrence.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def frequencyAsScala(value: Option[String]): ScheduledInstanceRecurrence.Builder = {
    value.fold(self) { v =>
      self.frequency(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def intervalAsScala(value: Option[Int]): ScheduledInstanceRecurrence.Builder = {
    value.fold(self) { v =>
      self.interval(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def occurrenceDaySetAsScala(value: Option[Seq[Int]]): ScheduledInstanceRecurrence.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Integer])).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.occurrenceDaySet(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def occurrenceRelativeToEndAsScala(value: Option[Boolean]): ScheduledInstanceRecurrence.Builder = {
    value.fold(self) { v =>
      self.occurrenceRelativeToEnd(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def occurrenceUnitAsScala(value: Option[String]): ScheduledInstanceRecurrence.Builder = {
    value.fold(self) { v =>
      self.occurrenceUnit(v)
    }
  }

}

final class ScheduledInstanceRecurrenceOps(val self: ScheduledInstanceRecurrence) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def frequencyAsScala: Option[String] = Option(self.frequency)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def intervalAsScala: Option[Int] = Option(self.interval)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def occurrenceDaySetAsScala: Option[Seq[Int]] = Option(self.occurrenceDaySet).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.map(_.intValue())
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def occurrenceRelativeToEndAsScala: Option[Boolean] = Option(self.occurrenceRelativeToEnd)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def occurrenceUnitAsScala: Option[String] = Option(self.occurrenceUnit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduledInstanceRecurrenceOps {

  implicit def toScheduledInstanceRecurrenceBuilderOps(
      v: ScheduledInstanceRecurrence.Builder
  ): ScheduledInstanceRecurrenceBuilderOps = new ScheduledInstanceRecurrenceBuilderOps(v)

  implicit def toScheduledInstanceRecurrenceOps(v: ScheduledInstanceRecurrence): ScheduledInstanceRecurrenceOps =
    new ScheduledInstanceRecurrenceOps(v)

}
