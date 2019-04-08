// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeBundleTasksRequestBuilderOps(val self: DescribeBundleTasksRequest.Builder) extends AnyVal {

  final def bundleIdsAsScala(value: Option[Seq[String]]): DescribeBundleTasksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.bundleIds(v.asJava)
    }
  }

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeBundleTasksRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

}

final class DescribeBundleTasksRequestOps(val self: DescribeBundleTasksRequest) extends AnyVal {

  final def bundleIdsAsScala: Option[Seq[String]] = Option(self.bundleIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeBundleTasksRequestOps {

  implicit def toDescribeBundleTasksRequestBuilderOps(
      v: DescribeBundleTasksRequest.Builder
  ): DescribeBundleTasksRequestBuilderOps = new DescribeBundleTasksRequestBuilderOps(v)

  implicit def toDescribeBundleTasksRequestOps(v: DescribeBundleTasksRequest): DescribeBundleTasksRequestOps =
    new DescribeBundleTasksRequestOps(v)

}
