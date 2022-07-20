package genetic;
import java.util.ArrayList;
class Thought155 extends Thought{
private static ArrayList<Thought155> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 168.21229542866882;
private double fd1 = 999.3708561746593;
private Thought fo0 = null;
private Thought fo1 = null;
Thought155 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought155 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought155 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought155 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought155 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought155 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought155 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought155 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought155 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought155 instance = new Thought155 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought155 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought155 instance = new Thought155 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought155 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought155 instance = new Thought155 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought155 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought155 instance = new Thought155 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought155 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought155 instance = new Thought155 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought155 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought155 instance = new Thought155 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought155 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought155 instance = new Thought155 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought155 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought155 instance = new Thought155 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2();
}
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought215.getInstance(fb0, fb1, fb0, fb1);
        boolean lb1 = false;
        Output.points[7][7] += fd0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
        fb0 = fd1 > fd0;
        fb1 = lb1 && fb0;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
        for(int i1=0; i1<10; i1++){
            Thought lo2 = Thought220.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        ab1 = fd1 > fd0;
        }
    ab2 = fd1 < fd0;
    Thought lo1 = Thought48.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
    boolean lb2 = false;
    Thought lo3 = Thought46.getInstance();
    double ld4 = 90.52356627257033;
    fd0 = fd1 - ld4;
    boolean lb5 = false;
    Output.points[7][8] += fd0;
    boolean lb6 = true;
    fd1 *= -1;
    for(int i1=0; i1<10; i1++){
if(fo0 != null){
          fo1 = fo0.m4(lb0, lb2, lb5, lb6);
}
        ab1 = ab2 && ab3;
        ab4 = !fb0;
        boolean lb7 = true;
if(fo1 != null){
          ld4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld4, fd0, fb0, fb1, lb7, lb0);
}
        lb2 = !lb5;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 942.8692473493791;
    ld0 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb0 = ld0 < ad1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ld0 + ad1;
    Thought lo1 = Thought30.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
        double ld2 = 845.1818092324728;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ad1, fb0, fb1, lb3, fb0);
}
    fb1 = lb3 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = false;
    Output.points[8][0] -= fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought363.getInstance(ad1, ad2, ad3, ad4);
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    lb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad3 = fo1.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    double ld2 = 900.1772426572969;
    ld2 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 736.4997039840978;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    double ld4 = 526.4777205167421;
    Thought lo5 = Thought29.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld3);
    boolean lb6 = false;
    boolean lb7 = false;
    boolean lb8 = false;
    lb6 = ld4 > ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb7, lb8, ab1, ab2);
}
    ad2 = ad3 + ad4;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    Thought lo0 = Thought14.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    double ld1 = 199.45739754004526;
    for(int i0=0; i0<10; i0++){
        ld1 = fd0 + fd1;
        double ld2 = 497.31343375377224;
if(fo0 != null){
          fo0.m3(ld2, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          ld2 = fo1.m3(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fb0 = !fb1;
        fb0 = ld1 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld2, ld1, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, ld1, fd0);
}
        fb1 = fd1 < ld2;
        ld1 *= -1;
if(ao2 != null){
          ao1 = ao2.m4();
}
        Output.points[8][1] -= fd0;
        Thought lo3 = Thought263.getInstance(fb0, fb1, fb0, fb1);
        boolean lb4 = false;
        boolean lb5 = true;
        Thought lo6 = Thought368.getInstance(ao3, ao4, fo0, fo1, fd1, ld2, ld1, fd0, lb4, lb5, fb0, fb1);
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought239.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    boolean lb1 = false;
        fb0 = !fb1;
    double ld2 = 124.71149132215041;
if(ao1 != null){
          fo1 = ao1.m4(ld2, ad1, ad2, ad3);
}
    boolean lb3 = false;
    if (lb1) {
if(ao2 != null){
          ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ad1);
}
        lb3 = ad2 < ad3;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb1, lb3);
}
        Output.points[8][2] += ad4;
        double ld4 = 846.2236436437466;
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld4, fb0, fb1, lb1, lb3);
}
        Output.points[8][3] += ld2;
        Thought lo5 = Thought333.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb3);
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb1, lb3);
}
        fb0 = fb1 || lb1;
        double ld6 = 954.2430592157825;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought162.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    Output.points[8][4] += fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
    Thought lo2 = Thought223.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
    Output.points[8][5] += fd1;
    fd0 = fd1 - fd0;
    double ld3 = 834.3717421926829;
    fd0 *= -1;
    Thought lo4 = Thought208.getInstance();
    lb1 = fd1 > ld3;
    fd0 = fd1 - ld3;
    fd0 = fd1 - ld3;
    ab1 = !ab2;
    ab3 = fd0 > fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    fd1 = ad1 + ad2;
if(ao4 != null){
      ao4.m3(ad3, ad4, fd0, fd1);
}
    double ld0 = 715.2257076964363;
    double ld1 = 910.5112393751383;
    ld0 = ld1 - ad1;
    ad2 = ad3 + ad4;
    boolean lb2 = false;
    ab3 = fd0 < fd1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, ld0, ld1, ad1, ad2);
}
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb0 = fb1 || lb2;
if(ao1 != null){
      fo1 = ao1.m4(ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought380.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb2, ab1);
    Output.points[8][6] -= ld0;
    Output.points[8][7] -= ld1;
        ab2 = ad1 < ad2;
    ad3 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 715.897901802671;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb0 = !fb1;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        double ld1 = 822.8338176126837;
        boolean lb2 = false;
        fd0 *= -1;
        Thought lo3 = Thought393.getInstance();
        lb2 = !fb0;
        boolean lb4 = true;
if(fo1 != null){
          fb0 = fo1.m2(fb1, lb2, lb4, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, ld0, fd0, fb1, lb2, lb4, fb0);
}
if(fo1 != null){
          fd1 = fo1.m3(ld1, ld0, fd0, fd1, fb1, lb2, lb4, fb0);
}
        ld1 *= -1;
        ld0 = fd0 - fd1;
        fb1 = ld1 < ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb4, fb0, fb1);
}
        lb2 = fd0 < fd1;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
    fd1 *= -1;
    Output.points[8][8] -= fd0;
    ab3 = fd1 > fd0;
    ab4 = fd1 > fd0;
    Thought lo0 = Thought13.getInstance(fb0, fb1, ab1, ab2);
    if (ab3) {
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
        Output.points[0][0] -= fd1;
        } else if (ab2) {
        Thought lo1 = Thought241.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
}
    lb1 = fb0 && fb1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    double ld2 = 491.30841085383463;
    Thought lo3 = Thought71.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
    boolean lb4 = false;
    lb0 = ad1 > ad2;
    lb1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, lb4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0, lb1, lb4, fb0, fb1);
}
    boolean lb5 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb1, lb4, lb5);
}
    Thought lo6 = Thought194.getInstance(fo0, fo1, fo0, fo1);

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    ab3 = ad2 < ad3;
    boolean lb0 = false;
    Thought lo1 = Thought90.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
    boolean lb2 = true;
    ab2 = ad2 > ad3;
    ab3 = ab4 || fb0;
    ad4 = fd0 - fd1;
    double ld3 = 744.0001677242536;
    double ld4 = 550.6266103163942;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld0 = 931.7456112866888;
if(ao3 != null){
      ao3.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    Thought lo1 = Thought150.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
    fd0 = fd1 - ld0;
    fd0 *= -1;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    fb0 = ad2 > ad3;
    ad4 *= -1;
if(ao2 != null){
      ao2.m1(fd0, fd1, ad1, ad2);
}
    double ld0 = 547.117332337237;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    fb1 = !fb0;
    double ld1 = 622.5348665924522;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb2 = false;
    Output.points[0][1] -= ld0;
    fb0 = fb1 && lb2;
    Thought lo3 = Thought56.getInstance(fb0, fb1, lb2, fb0);
    ld1 *= -1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
if(ao3 != null){
      ao3.m3(fd0, fd1, ld0, ld1, fb0, fb1, lb2, fb0);
}
        ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb1, lb2, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd0 > fd1;
    double ld0 = 237.28805741573385;
    ld0 = fd0 + fd1;
    boolean lb1 = false;
    ab2 = !ab3;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    Output.points[0][2] -= ld0;
    ab4 = fb0 || fb1;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
    Thought lo2 = Thought311.getInstance(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(lb1, lb3, ab1, ab2);
}
    fd0 = fd1 - ld0;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
if(ao2 != null){
      lb3 = ao2.m2(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    Thought lo4 = Thought52.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb3);
    ab1 = ld0 < fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, ld0, fd0, fd1);
}
    boolean lb5 = true;
    Thought lo6 = Thought293.getInstance(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0);

Thought.STACK_COUNTER++;
return ab1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = ad2 < ad3;
    Output.points[0][3] -= ad4;
    ab2 = fd0 < fd1;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ab3 = ab4 || fb0;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    fb1 = ab1 && ab2;
    ab3 = !ab4;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought395.getInstance(fb1, fb0, fb1, fb0);
    Output.points[0][4] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
        fb0 = !fb1;
    lb1 = fb0 || fb1;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        ab2 = fd0 > fd1;
        Output.points[0][5] -= fd0;
        ab3 = ab4 && fb0;
        Output.points[0][6] -= fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        fd1 = fd0 - fd1;
if(fo0 != null){
          fd0 = fo0.m3();
}
        fb1 = ab1 || ab2;
        Thought lo0 = Thought264.getInstance(ab3, ab4, fb0, fb1);
        fd1 *= -1;
        boolean lb1 = false;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    if (fb0) {
        fd0 *= -1;
        Thought lo0 = Thought166.getInstance(fd1, ad1, ad2, ad3);
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        ad2 = ad3 + ad4;
        fd0 = fd1 + ad1;
if(fo1 != null){
          fb0 = fo1.m2();
}
        Thought lo1 = Thought42.getInstance(fb1, fb0, fb1, fb0);
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb2, fb0);
}
if(fo0 != null){
          fo0.m2(fd1, ad1, ad2, ad3, fb1, lb2, fb0, fb1);
}
        lb2 = fb0 && fb1;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        double ld3 = 244.35219980471518;
        fb0 = fb1 || lb2;
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
        Thought lo0 = Thought213.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
if(fo0 != null){
          fo1 = fo0.m4();
}
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
        double ld1 = 231.57191761757088;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1, ab2, ab3, ab4, fb0);
}
}
Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    if (fb1) {
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        fd1 = fd0 - fd1;
if(ao3 != null){
          fd0 = ao3.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
if(ao1 != null){
          fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
}
Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fd0 = fd1 + ad1;
        double ld0 = 27.661878471092088;
        fb1 = fb0 || fb1;
        boolean lb1 = true;
        double ld2 = 56.08132296285923;
if(ao3 != null){
          ao2 = ao3.m4(ld2, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
        Thought lo3 = Thought214.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
        fb1 = lb1 && fb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb1 = !lb1;
        } else {
        fb1 = fd1 > ad1;
        ad2 = ad3 - ad4;
        Thought lo4 = Thought70.getInstance(fd0, fd1, ad1, ad2);
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
        fb0 = ad1 > ad2;
        fb1 = !fb0;
        ad3 *= -1;
if(ao1 != null){
          ad4 = ao1.m3();
}
        fb1 = fd0 > fd1;
        ad1 = ad2 - ad3;
}
Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought330.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    ab4 = fd0 < fd1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    Output.points[0][7] -= fd0;
    boolean lb1 = true;
    fd1 *= -1;
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2();
}
    ab1 = !ab2;
if(ao2 != null){
      ao2.m1(ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    Output.points[0][8] -= ad2;
    ad3 = ad4 + fd0;
    Thought lo1 = Thought312.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought230.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fb1 = fo0.m2(ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3();
}
if(ao1 != null){
      ao1.m3(lb0, ab1, ab2, ab3);
}
    Output.points[1][0] -= ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
    ab1 = ad3 < ad4;
    Thought lo3 = Thought335.getInstance(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
    fb1 = !lb0;

Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought31.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    Output.points[1][1] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd1 < fd0;
    lb1 = !fb0;
    boolean lb2 = true;
    if (fb0) {
        double ld3 = 768.4887654762847;
        fb1 = fd0 < fd1;
        ld3 = fd0 + fd1;
if(fo1 != null){
          fo1.m3(lb1, lb2, fb0, fb1);
}
        boolean lb4 = true;
        } else if (lb1) {
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;
    Thought lo0 = Thought280.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    Thought lo1 = Thought365.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
        fd0 *= -1;
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought7.getInstance(ab4, fb0, fb1, ab1);
    Output.points[1][2] += fd1;
    ab2 = fd0 > fd1;
    boolean lb3 = false;
        boolean lb4 = true;
    Thought lo5 = Thought180.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb3, lb4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
    if (lb0) {
        Output.points[1][3] -= ad4;
        fd0 = fd1 + ad1;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        boolean lb1 = false;
    ab4 = fd1 < ad1;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, lb0, lb1, ab1);
}
    ab2 = fd1 > ad1;
    ab3 = ad2 > ad3;
    ab4 = fb0 || fb1;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought257.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, ab1, ab2);
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld3 = 780.578755144901;
    ab4 = ld3 < ad1;
    Thought lo4 = Thought66.getInstance(ad2, ad3, ad4, fd0);
    fb0 = !fb1;
    fd1 *= -1;
    ld3 = ad1 + ad2;
    Output.points[1][4] -= ad3;
    boolean lb5 = false;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought396.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    double ld1 = 465.2890304493734;
    fb0 = fb1 || fb0;
    boolean lb2 = false;
    double ld3 = 702.5468552404808;
    double ld4 = 773.287413688185;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ld3, ld4, fd0, fd1);
}
if(ao2 != null){
      ld1 = ao2.m3();
}
    Output.points[1][5] += ld3;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb2, fb0);
}
    ld4 = fd0 + fd1;
    Thought lo5 = Thought285.getInstance(fo0, fo1, ao1, ao2, ld1, ld3, ld4, fd0, fb1, lb2, fb0, fb1);

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 *= -1;
    Output.points[1][6] += ad1;
    fb0 = fb1 || fb0;
    Output.points[1][7] -= ad2;
    fb1 = ad3 < ad4;
    fb0 = fb1 || fb0;
    fd0 *= -1;
        fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fb1 = fd1 > ad1;
    fb0 = fb1 && fb0;
    fb1 = ad2 < ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb0 = ad4 < fd0;
    boolean lb0 = false;
if(ao4 != null){
          ao4.m3(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
    fb0 = ad2 > ad3;
if(fo0 != null){
      fo0.m2();
}
    Thought lo1 = Thought277.getInstance(fb1, lb0, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
    boolean lb2 = false;
    ad2 *= -1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
        fd0 *= -1;
    if (ab1) {
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        boolean lb1 = false;
        double ld2 = 933.9500485373542;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, lb0);
}
        double ld3 = 537.4159378619775;
        Thought lo4 = Thought20.getInstance(ao3, ao4, fo0, fo1);
        boolean lb5 = false;
        ld3 = fd0 + fd1;
        Output.points[1][8] -= ld2;
        Thought lo6 = Thought200.getInstance(ld3, fd0, fd1, ld2);
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld2);
}
        lb0 = !ab1;
if(ao1 != null){
          fo1 = ao1.m4();
}
        double ld7 = 193.43552724730642;
        ld3 = ld7 + fd0;
        double ld8 = 13.097617726370549;
        fd0 = fd1 + ld2;
if(ao2 != null){
          ld3 = ao2.m3(ab2, ab3, ab4, fb0);
}
        boolean lb9 = false;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ld7, ld8, fd0, fd1, fb0, fb1, lb1, lb5);
}
        ld2 = ld3 - ld7;
}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao1 != null){
      ao1.m2(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 + ad2;
    fb0 = fb1 || ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      ao3.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Output.points[2][0] += fd0;
if(ao4 != null){
      fb1 = ao4.m2(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    double ld0 = 898.9523300887;
    Thought lo1 = Thought185.getInstance(ao4, fo0, fo1, ao1);
    Output.points[2][1] += ad3;

Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fd0 *= -1;
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    double ld0 = 951.8878670147803;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought217.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    lb0 = fb0 && fb1;
    boolean lb2 = true;
if(fo1 != null){
      fd0 = fo1.m3(lb0, lb2, fb0, fb1);
}
        Output.points[2][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, lb2, fb0, fb1);
}
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb0);
}
    double ld3 = 756.1216022200161;
    lb2 = fd0 < fd1;
    ld3 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
