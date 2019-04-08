// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeClustersRequestBuilderOps(val self: DescribeClustersRequest.Builder) extends AnyVal {

  final def clustersAsScala(value: Option[Seq[String]]): DescribeClustersRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.clusters(v.asJava)
    }
  }

  final def includeAsScala(value: Option[Seq[ClusterField]]): DescribeClustersRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.include(v.asJava)
    }
  }

}

final class DescribeClustersRequestOps(val self: DescribeClustersRequest) extends AnyVal {

  final def clustersAsScala: Option[Seq[String]] = Option(self.clusters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def includeAsScala: Option[Seq[ClusterField]] = Option(self.include).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClustersRequestOps {

  implicit def toDescribeClustersRequestBuilderOps(
      v: DescribeClustersRequest.Builder
  ): DescribeClustersRequestBuilderOps = new DescribeClustersRequestBuilderOps(v)

  implicit def toDescribeClustersRequestOps(v: DescribeClustersRequest): DescribeClustersRequestOps =
    new DescribeClustersRequestOps(v)

}
