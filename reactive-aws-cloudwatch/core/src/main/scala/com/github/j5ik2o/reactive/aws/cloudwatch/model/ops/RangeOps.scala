// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class RangeBuilderOps(val self: Range.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala(value: Option[java.time.Instant]): Range.Builder = {
    value.fold(self) { v => self.startTime(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimeAsScala(value: Option[java.time.Instant]): Range.Builder = {
    value.fold(self) { v => self.endTime(v) }
  }

}

final class RangeOps(val self: Range) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def startTimeAsScala: Option[java.time.Instant] = Option(self.startTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def endTimeAsScala: Option[java.time.Instant] = Option(self.endTime)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRangeOps {

  implicit def toRangeBuilderOps(v: Range.Builder): RangeBuilderOps = new RangeBuilderOps(v)

  implicit def toRangeOps(v: Range): RangeOps = new RangeOps(v)

}
