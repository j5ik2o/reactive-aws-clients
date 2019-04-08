// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ScheduledInstanceRecurrenceRequestBuilderOps(val self: ScheduledInstanceRecurrenceRequest.Builder)
    extends AnyVal {

  final def frequencyAsScala(value: Option[String]): ScheduledInstanceRecurrenceRequest.Builder = {
    value.fold(self) { v =>
      self.frequency(v)
    }
  }

  final def intervalAsScala(value: Option[Int]): ScheduledInstanceRecurrenceRequest.Builder = {
    value.fold(self) { v =>
      self.interval(v)
    }
  }

  final def occurrenceDaysAsScala(value: Option[Seq[Int]]): ScheduledInstanceRecurrenceRequest.Builder = {
    value.filter(_.nonEmpty).map(_.map(_.asInstanceOf[java.lang.Integer])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.occurrenceDays(v.asJava)
    }
  }

  final def occurrenceRelativeToEndAsScala(value: Option[Boolean]): ScheduledInstanceRecurrenceRequest.Builder = {
    value.fold(self) { v =>
      self.occurrenceRelativeToEnd(v)
    }
  }

  final def occurrenceUnitAsScala(value: Option[String]): ScheduledInstanceRecurrenceRequest.Builder = {
    value.fold(self) { v =>
      self.occurrenceUnit(v)
    }
  }

}

final class ScheduledInstanceRecurrenceRequestOps(val self: ScheduledInstanceRecurrenceRequest) extends AnyVal {

  final def frequencyAsScala: Option[String] = Option(self.frequency)

  final def intervalAsScala: Option[Int] = Option(self.interval)

  final def occurrenceDaysAsScala: Option[Seq[Int]] = Option(self.occurrenceDays).map { v =>
    import scala.collection.JavaConverters._; v.asScala.map(_.intValue())
  }

  final def occurrenceRelativeToEndAsScala: Option[Boolean] = Option(self.occurrenceRelativeToEnd)

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
