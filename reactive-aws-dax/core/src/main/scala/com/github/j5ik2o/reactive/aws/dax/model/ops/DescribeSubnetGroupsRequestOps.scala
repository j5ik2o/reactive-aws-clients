// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeSubnetGroupsRequestBuilderOps(val self: DescribeSubnetGroupsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetGroupNamesAsScala(value: Option[Seq[String]]): DescribeSubnetGroupsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnetGroupNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeSubnetGroupsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeSubnetGroupsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeSubnetGroupsRequestOps(val self: DescribeSubnetGroupsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetGroupNamesAsScala: Option[Seq[String]] = Option(self.subnetGroupNames).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSubnetGroupsRequestOps {

  implicit def toDescribeSubnetGroupsRequestBuilderOps(
      v: DescribeSubnetGroupsRequest.Builder
  ): DescribeSubnetGroupsRequestBuilderOps = new DescribeSubnetGroupsRequestBuilderOps(v)

  implicit def toDescribeSubnetGroupsRequestOps(v: DescribeSubnetGroupsRequest): DescribeSubnetGroupsRequestOps =
    new DescribeSubnetGroupsRequestOps(v)

}
