// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class RestoreObjectResponseBuilderOps(val self: RestoreObjectResponse.Builder) extends AnyVal {

  final def requestChargedAsScala(value: Option[RequestCharged]): RestoreObjectResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // RequestCharged

  final def restoreOutputPathAsScala(value: Option[String]): RestoreObjectResponse.Builder = {
    value.fold(self) { v =>
      self.restoreOutputPath(v)
    }
  } // String

}

final class RestoreObjectResponseOps(val self: RestoreObjectResponse) extends AnyVal {

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // RequestCharged

  final def restoreOutputPathAsScala: Option[String] = Option(self.restoreOutputPath) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRestoreObjectResponseOps {

  implicit def toRestoreObjectResponseBuilderOps(v: RestoreObjectResponse.Builder): RestoreObjectResponseBuilderOps =
    new RestoreObjectResponseBuilderOps(v)

  implicit def toRestoreObjectResponseOps(v: RestoreObjectResponse): RestoreObjectResponseOps =
    new RestoreObjectResponseOps(v)

}
