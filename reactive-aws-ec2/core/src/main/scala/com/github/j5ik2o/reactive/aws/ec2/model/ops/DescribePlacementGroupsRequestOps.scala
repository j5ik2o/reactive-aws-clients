// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribePlacementGroupsRequestBuilderOps(val self: DescribePlacementGroupsRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribePlacementGroupsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def groupNamesAsScala(value: Option[Seq[String]]): DescribePlacementGroupsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groupNames(v.asJava)
    }
  }

}

final class DescribePlacementGroupsRequestOps(val self: DescribePlacementGroupsRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def groupNamesAsScala: Option[Seq[String]] = Option(self.groupNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribePlacementGroupsRequestOps {

  implicit def toDescribePlacementGroupsRequestBuilderOps(
      v: DescribePlacementGroupsRequest.Builder
  ): DescribePlacementGroupsRequestBuilderOps = new DescribePlacementGroupsRequestBuilderOps(v)

  implicit def toDescribePlacementGroupsRequestOps(
      v: DescribePlacementGroupsRequest
  ): DescribePlacementGroupsRequestOps = new DescribePlacementGroupsRequestOps(v)

}
