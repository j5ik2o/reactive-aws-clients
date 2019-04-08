// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RegionBuilderOps(val self: Region.Builder) extends AnyVal {

  final def endpointAsScala(value: Option[String]): Region.Builder = {
    value.fold(self) { v =>
      self.endpoint(v)
    }
  }

  final def regionNameAsScala(value: Option[String]): Region.Builder = {
    value.fold(self) { v =>
      self.regionName(v)
    }
  }

}

final class RegionOps(val self: Region) extends AnyVal {

  final def endpointAsScala: Option[String] = Option(self.endpoint)

  final def regionNameAsScala: Option[String] = Option(self.regionName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRegionOps {

  implicit def toRegionBuilderOps(v: Region.Builder): RegionBuilderOps = new RegionBuilderOps(v)

  implicit def toRegionOps(v: Region): RegionOps = new RegionOps(v)

}
