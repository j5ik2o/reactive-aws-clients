// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class GetAuthorizationTokenResponseBuilderOps(val self: GetAuthorizationTokenResponse.Builder) extends AnyVal {

  final def authorizationDataAsScala(value: Option[Seq[AuthorizationData]]): GetAuthorizationTokenResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.authorizationData(v.asJava)
    }
  }

}

final class GetAuthorizationTokenResponseOps(val self: GetAuthorizationTokenResponse) extends AnyVal {

  final def authorizationDataAsScala: Option[Seq[AuthorizationData]] = Option(self.authorizationData).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetAuthorizationTokenResponseOps {

  implicit def toGetAuthorizationTokenResponseBuilderOps(
      v: GetAuthorizationTokenResponse.Builder
  ): GetAuthorizationTokenResponseBuilderOps = new GetAuthorizationTokenResponseBuilderOps(v)

  implicit def toGetAuthorizationTokenResponseOps(v: GetAuthorizationTokenResponse): GetAuthorizationTokenResponseOps =
    new GetAuthorizationTokenResponseOps(v)

}
