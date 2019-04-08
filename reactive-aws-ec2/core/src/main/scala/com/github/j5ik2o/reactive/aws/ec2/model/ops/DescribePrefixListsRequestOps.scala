// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribePrefixListsRequestBuilderOps(val self: DescribePrefixListsRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[Filter]]): DescribePrefixListsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribePrefixListsRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribePrefixListsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def prefixListIdsAsScala(value: Option[Seq[String]]): DescribePrefixListsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.prefixListIds(v.asJava)
    }
  }

}

final class DescribePrefixListsRequestOps(val self: DescribePrefixListsRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def prefixListIdsAsScala: Option[Seq[String]] = Option(self.prefixListIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribePrefixListsRequestOps {

  implicit def toDescribePrefixListsRequestBuilderOps(
      v: DescribePrefixListsRequest.Builder
  ): DescribePrefixListsRequestBuilderOps = new DescribePrefixListsRequestBuilderOps(v)

  implicit def toDescribePrefixListsRequestOps(v: DescribePrefixListsRequest): DescribePrefixListsRequestOps =
    new DescribePrefixListsRequestOps(v)

}
