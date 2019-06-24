// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class DescribeRepositoriesResponseBuilderOps(val self: DescribeRepositoriesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoriesAsScala(value: Option[Seq[Repository]]): DescribeRepositoriesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.repositories(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeRepositoriesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeRepositoriesResponseOps(val self: DescribeRepositoriesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoriesAsScala: Option[Seq[Repository]] = Option(self.repositories).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeRepositoriesResponseOps {

  implicit def toDescribeRepositoriesResponseBuilderOps(
      v: DescribeRepositoriesResponse.Builder
  ): DescribeRepositoriesResponseBuilderOps = new DescribeRepositoriesResponseBuilderOps(v)

  implicit def toDescribeRepositoriesResponseOps(v: DescribeRepositoriesResponse): DescribeRepositoriesResponseOps =
    new DescribeRepositoriesResponseOps(v)

}
