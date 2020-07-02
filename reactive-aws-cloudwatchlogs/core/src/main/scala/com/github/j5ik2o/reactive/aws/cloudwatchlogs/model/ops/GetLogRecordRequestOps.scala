// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class GetLogRecordRequestBuilderOps(val self: GetLogRecordRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logRecordPointerAsScala(value: Option[String]): GetLogRecordRequest.Builder = {
    value.fold(self) { v => self.logRecordPointer(v) }
  }

}

final class GetLogRecordRequestOps(val self: GetLogRecordRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logRecordPointerAsScala: Option[String] = Option(self.logRecordPointer)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLogRecordRequestOps {

  implicit def toGetLogRecordRequestBuilderOps(v: GetLogRecordRequest.Builder): GetLogRecordRequestBuilderOps =
    new GetLogRecordRequestBuilderOps(v)

  implicit def toGetLogRecordRequestOps(v: GetLogRecordRequest): GetLogRecordRequestOps = new GetLogRecordRequestOps(v)

}
