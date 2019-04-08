// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribePrefixListsResponseBuilderOps(val self: DescribePrefixListsResponse.Builder) extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): DescribePrefixListsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def prefixListsAsScala(value: Option[Seq[PrefixList]]): DescribePrefixListsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.prefixLists(v.asJava)
    }
  }

}

final class DescribePrefixListsResponseOps(val self: DescribePrefixListsResponse) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def prefixListsAsScala: Option[Seq[PrefixList]] = Option(self.prefixLists).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribePrefixListsResponseOps {

  implicit def toDescribePrefixListsResponseBuilderOps(
      v: DescribePrefixListsResponse.Builder
  ): DescribePrefixListsResponseBuilderOps = new DescribePrefixListsResponseBuilderOps(v)

  implicit def toDescribePrefixListsResponseOps(v: DescribePrefixListsResponse): DescribePrefixListsResponseOps =
    new DescribePrefixListsResponseOps(v)

}
