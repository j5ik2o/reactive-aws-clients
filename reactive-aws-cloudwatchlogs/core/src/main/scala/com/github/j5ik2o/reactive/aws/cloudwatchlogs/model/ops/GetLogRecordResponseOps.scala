// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class GetLogRecordResponseBuilderOps(val self: GetLogRecordResponse.Builder) extends AnyVal {

  final def logRecordAsScala(value: Option[Map[String, String]]): GetLogRecordResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.logRecord(v.asJava)
    }
  }

}

final class GetLogRecordResponseOps(val self: GetLogRecordResponse) extends AnyVal {

  final def logRecordAsScala: Option[Map[String, String]] = Option(self.logRecord).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLogRecordResponseOps {

  implicit def toGetLogRecordResponseBuilderOps(v: GetLogRecordResponse.Builder): GetLogRecordResponseBuilderOps =
    new GetLogRecordResponseBuilderOps(v)

  implicit def toGetLogRecordResponseOps(v: GetLogRecordResponse): GetLogRecordResponseOps =
    new GetLogRecordResponseOps(v)

}
