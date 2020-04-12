// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class SearchFilterBuilderOps(val self: SearchFilter.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala(value: Option[String]): SearchFilter.Builder = {
    value.fold(self) { v =>
      self.attribute(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operatorAsScala(value: Option[String]): SearchFilter.Builder = {
    value.fold(self) { v =>
      self.operator(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valuesAsScala(value: Option[Seq[String]]): SearchFilter.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.values(v.asJava)
    }
  }

}

final class SearchFilterOps(val self: SearchFilter) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeAsScala: Option[String] = Option(self.attribute)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operatorAsScala: Option[String] = Option(self.operator)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def valuesAsScala: Option[Seq[String]] = Option(self.values).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSearchFilterOps {

  implicit def toSearchFilterBuilderOps(v: SearchFilter.Builder): SearchFilterBuilderOps = new SearchFilterBuilderOps(v)

  implicit def toSearchFilterOps(v: SearchFilter): SearchFilterOps = new SearchFilterOps(v)

}
