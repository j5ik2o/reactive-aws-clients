// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class PutLogEventsRequestBuilderOps(val self: PutLogEventsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala(value: Option[String]): PutLogEventsRequest.Builder = {
    value.fold(self) { v => self.logGroupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNameAsScala(value: Option[String]): PutLogEventsRequest.Builder = {
    value.fold(self) { v => self.logStreamName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logEventsAsScala(value: Option[Seq[InputLogEvent]]): PutLogEventsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.logEvents(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sequenceTokenAsScala(value: Option[String]): PutLogEventsRequest.Builder = {
    value.fold(self) { v => self.sequenceToken(v) }
  }

}

final class PutLogEventsRequestOps(val self: PutLogEventsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logGroupNameAsScala: Option[String] = Option(self.logGroupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logStreamNameAsScala: Option[String] = Option(self.logStreamName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logEventsAsScala: Option[Seq[InputLogEvent]] =
    Option(self.logEvents).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sequenceTokenAsScala: Option[String] = Option(self.sequenceToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutLogEventsRequestOps {

  implicit def toPutLogEventsRequestBuilderOps(v: PutLogEventsRequest.Builder): PutLogEventsRequestBuilderOps =
    new PutLogEventsRequestBuilderOps(v)

  implicit def toPutLogEventsRequestOps(v: PutLogEventsRequest): PutLogEventsRequestOps = new PutLogEventsRequestOps(v)

}
