// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class JSONOutputBuilderOps(val self: JSONOutput.Builder) extends AnyVal {

  final def withRecordDelimiterAsScala(value: Option[String]): JSONOutput.Builder = {
    value.fold(self) { v =>
      self.recordDelimiter(v)
    }
  } // String

}

final class JSONOutputOps(val self: JSONOutput) extends AnyVal {

  final def recordDelimiterAsScala: Option[String] = Option(self.recordDelimiter) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToJSONOutputOps {

  implicit def toJSONOutputBuilderOps(v: JSONOutput.Builder): JSONOutputBuilderOps = new JSONOutputBuilderOps(v)

  implicit def toJSONOutputOps(v: JSONOutput): JSONOutputOps = new JSONOutputOps(v)

}
