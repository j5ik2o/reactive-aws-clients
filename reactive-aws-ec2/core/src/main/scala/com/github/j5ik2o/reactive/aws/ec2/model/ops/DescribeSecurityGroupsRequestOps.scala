// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeSecurityGroupsRequestBuilderOps(val self: DescribeSecurityGroupsRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeSecurityGroupsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def groupIdsAsScala(value: Option[Seq[String]]): DescribeSecurityGroupsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groupIds(v.asJava)
    }
  }

  final def groupNamesAsScala(value: Option[Seq[String]]): DescribeSecurityGroupsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groupNames(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeSecurityGroupsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeSecurityGroupsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeSecurityGroupsRequestOps(val self: DescribeSecurityGroupsRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def groupIdsAsScala: Option[Seq[String]] = Option(self.groupIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def groupNamesAsScala: Option[Seq[String]] = Option(self.groupNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeSecurityGroupsRequestOps {

  implicit def toDescribeSecurityGroupsRequestBuilderOps(
      v: DescribeSecurityGroupsRequest.Builder
  ): DescribeSecurityGroupsRequestBuilderOps = new DescribeSecurityGroupsRequestBuilderOps(v)

  implicit def toDescribeSecurityGroupsRequestOps(v: DescribeSecurityGroupsRequest): DescribeSecurityGroupsRequestOps =
    new DescribeSecurityGroupsRequestOps(v)

}
