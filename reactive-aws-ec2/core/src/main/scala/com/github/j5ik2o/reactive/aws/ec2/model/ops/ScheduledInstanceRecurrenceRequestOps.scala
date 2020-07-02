// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstanceRecurrenceRequestBuilderOps(val self: ScheduledInstanceRecurrenceRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def frequencyAsScala(value: Option[String]): ScheduledInstanceRecurrenceRequest.Builder = {
    value.fold(self) { v => self.frequency(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def intervalAsScala(value: Option[Int]): ScheduledInstanceRecurrenceRequest.Builder = {
    value.fold(self) { v => self.interval(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def occurrenceDaysAsScala(value: Option[Seq[Int]]): ScheduledInstanceRecurrenceRequest.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Integer])).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.occurrenceDays(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def occurrenceRelativeToEndAsScala(value: Option[Boolean]): ScheduledInstanceRecurrenceRequest.Builder = {
    value.fold(self) { v => self.occurrenceRelativeToEnd(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def occurrenceUnitAsScala(value: Option[String]): ScheduledInstanceRecurrenceRequest.Builder = {
    value.fold(self) { v => self.occurrenceUnit(v) }
  }

}

final class ScheduledInstanceRecurrenceRequestOps(val self: ScheduledInstanceRecurrenceRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def frequencyAsScala: Option[String] = Option(self.frequency)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def intervalAsScala: Option[Int] = Option(self.interval)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def occurrenceDaysAsScala: Option[Seq[Int]] =
    Option(self.occurrenceDays).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.map(_.intValue())
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def occurrenceRelativeToEndAsScala: Option[Boolean] = Option(self.occurrenceRelativeToEnd)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def occurrenceUnitAsScala: Option[String] = Option(self.occurrenceUnit)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToScheduledInstanceRecurrenceRequestOps {

  implicit def toScheduledInstanceRecurrenceRequestBuilderOps(
      v: ScheduledInstanceRecurrenceRequest.Builder
  ): ScheduledInstanceRecurrenceRequestBuilderOps = new ScheduledInstanceRecurrenceRequestBuilderOps(v)

  implicit def toScheduledInstanceRecurrenceRequestOps(
      v: ScheduledInstanceRecurrenceRequest
  ): ScheduledInstanceRecurrenceRequestOps = new ScheduledInstanceRecurrenceRequestOps(v)

}
