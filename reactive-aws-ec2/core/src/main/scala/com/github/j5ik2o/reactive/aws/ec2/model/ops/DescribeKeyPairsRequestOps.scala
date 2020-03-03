// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribeKeyPairsRequestBuilderOps(val self: DescribeKeyPairsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala(value: Option[Seq[Filter]]): DescribeKeyPairsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.filters(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNamesAsScala(value: Option[Seq[String]]): DescribeKeyPairsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keyNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyPairIdsAsScala(value: Option[Seq[String]]): DescribeKeyPairsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.keyPairIds(v.asJava)
    }
  }

}

final class DescribeKeyPairsRequestOps(val self: DescribeKeyPairsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filtersAsScala: Option[Seq[Filter]] = Option(self.filters).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNamesAsScala: Option[Seq[String]] = Option(self.keyNames).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyPairIdsAsScala: Option[Seq[String]] = Option(self.keyPairIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeKeyPairsRequestOps {

  implicit def toDescribeKeyPairsRequestBuilderOps(
      v: DescribeKeyPairsRequest.Builder
  ): DescribeKeyPairsRequestBuilderOps = new DescribeKeyPairsRequestBuilderOps(v)

  implicit def toDescribeKeyPairsRequestOps(v: DescribeKeyPairsRequest): DescribeKeyPairsRequestOps =
    new DescribeKeyPairsRequestOps(v)

}
