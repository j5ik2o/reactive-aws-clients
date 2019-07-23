// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReleaseHostsRequestBuilderOps(val self: ReleaseHostsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdsAsScala(value: Option[Seq[String]]): ReleaseHostsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.hostIds(v.asJava)
    }
  }

}

final class ReleaseHostsRequestOps(val self: ReleaseHostsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def hostIdsAsScala: Option[Seq[String]] = Option(self.hostIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReleaseHostsRequestOps {

  implicit def toReleaseHostsRequestBuilderOps(v: ReleaseHostsRequest.Builder): ReleaseHostsRequestBuilderOps =
    new ReleaseHostsRequestBuilderOps(v)

  implicit def toReleaseHostsRequestOps(v: ReleaseHostsRequest): ReleaseHostsRequestOps = new ReleaseHostsRequestOps(v)

}
