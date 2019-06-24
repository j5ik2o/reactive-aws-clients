// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RouteTableBuilderOps(val self: RouteTable.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationsAsScala(value: Option[Seq[RouteTableAssociation]]): RouteTable.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.associations(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propagatingVgwsAsScala(value: Option[Seq[PropagatingVgw]]): RouteTable.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.propagatingVgws(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routeTableIdAsScala(value: Option[String]): RouteTable.Builder = {
    value.fold(self) { v =>
      self.routeTableId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routesAsScala(value: Option[Seq[Route]]): RouteTable.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.routes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): RouteTable.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): RouteTable.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala(value: Option[String]): RouteTable.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

}

final class RouteTableOps(val self: RouteTable) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def associationsAsScala: Option[Seq[RouteTableAssociation]] = Option(self.associations).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def propagatingVgwsAsScala: Option[Seq[PropagatingVgw]] = Option(self.propagatingVgws).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routeTableIdAsScala: Option[String] = Option(self.routeTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routesAsScala: Option[Seq[Route]] = Option(self.routes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRouteTableOps {

  implicit def toRouteTableBuilderOps(v: RouteTable.Builder): RouteTableBuilderOps = new RouteTableBuilderOps(v)

  implicit def toRouteTableOps(v: RouteTable): RouteTableOps = new RouteTableOps(v)

}
