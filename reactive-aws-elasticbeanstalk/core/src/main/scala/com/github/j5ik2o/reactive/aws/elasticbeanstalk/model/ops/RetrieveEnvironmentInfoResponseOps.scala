// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class RetrieveEnvironmentInfoResponseBuilderOps(val self: RetrieveEnvironmentInfoResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentInfoAsScala(
      value: Option[Seq[EnvironmentInfoDescription]]
  ): RetrieveEnvironmentInfoResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.environmentInfo(v.asJava)
    }
  }

}

final class RetrieveEnvironmentInfoResponseOps(val self: RetrieveEnvironmentInfoResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentInfoAsScala: Option[Seq[EnvironmentInfoDescription]] = Option(self.environmentInfo).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRetrieveEnvironmentInfoResponseOps {

  implicit def toRetrieveEnvironmentInfoResponseBuilderOps(
      v: RetrieveEnvironmentInfoResponse.Builder
  ): RetrieveEnvironmentInfoResponseBuilderOps = new RetrieveEnvironmentInfoResponseBuilderOps(v)

  implicit def toRetrieveEnvironmentInfoResponseOps(
      v: RetrieveEnvironmentInfoResponse
  ): RetrieveEnvironmentInfoResponseOps = new RetrieveEnvironmentInfoResponseOps(v)

}
