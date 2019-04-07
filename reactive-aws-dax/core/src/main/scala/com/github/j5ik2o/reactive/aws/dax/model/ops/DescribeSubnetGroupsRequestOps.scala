// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeSubnetGroupsRequestBuilderOps(val self: DescribeSubnetGroupsRequest.Builder) extends AnyVal {

  final def withSubnetGroupNamesAsScala(value: Option[Seq[String]]): DescribeSubnetGroupsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.subnetGroupNames(v.asJava)
    } // Seq[String]
  }

  final def withMaxResultsAsScala(value: Option[Int]): DescribeSubnetGroupsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  } // Int

  final def withNextTokenAsScala(value: Option[String]): DescribeSubnetGroupsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class DescribeSubnetGroupsRequestOps(val self: DescribeSubnetGroupsRequest) extends AnyVal {

  final def subnetGroupNamesAsScala: Option[Seq[String]] = Option(self.subnetGroupNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults) // Int

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSubnetGroupsRequestOps {

  implicit def toDescribeSubnetGroupsRequestBuilderOps(
      v: DescribeSubnetGroupsRequest.Builder
  ): DescribeSubnetGroupsRequestBuilderOps = new DescribeSubnetGroupsRequestBuilderOps(v)

  implicit def toDescribeSubnetGroupsRequestOps(v: DescribeSubnetGroupsRequest): DescribeSubnetGroupsRequestOps =
    new DescribeSubnetGroupsRequestOps(v)

}
