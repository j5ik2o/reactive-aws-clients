// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class DescribePackagesFilterBuilderOps(val self: DescribePackagesFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[DescribePackagesFilterName]): DescribePackagesFilter.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala(value: Option[Seq[String]]): DescribePackagesFilter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.value(v.asJava)
    }
  }

}

final class DescribePackagesFilterOps(val self: DescribePackagesFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[DescribePackagesFilterName] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valueAsScala: Option[Seq[String]] = Option(self.value).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribePackagesFilterOps {

  implicit def toDescribePackagesFilterBuilderOps(v: DescribePackagesFilter.Builder): DescribePackagesFilterBuilderOps =
    new DescribePackagesFilterBuilderOps(v)

  implicit def toDescribePackagesFilterOps(v: DescribePackagesFilter): DescribePackagesFilterOps =
    new DescribePackagesFilterOps(v)

}
