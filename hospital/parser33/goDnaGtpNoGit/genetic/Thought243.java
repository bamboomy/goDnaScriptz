package genetic;
import java.util.ArrayList;
class Thought243 extends Thought{
private static ArrayList<Thought243> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 343.82925126743646;
private double fd1 = 346.14069776876863;
private Thought fo0 = null;
private Thought fo1 = null;
Thought243 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought243 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought243 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought243 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought243 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought243 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought243 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought243 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought243 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought243 instance = new Thought243 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought243 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought243 instance = new Thought243 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought243 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought243 instance = new Thought243 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought243 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought243 instance = new Thought243 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought243 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought243 instance = new Thought243 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought243 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought243 instance = new Thought243 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought243 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought243 instance = new Thought243 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought243 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought243 instance = new Thought243 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought326.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
        fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[6][7] -= fd1;
    Thought lo1 = Thought51.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb2 = false;
    fd0 *= -1;
    fb0 = fd1 < fd0;
    Output.points[6][8] -= fd1;
if(fo0 != null){
      fo0.m1();
}
    fb1 = !lb2;
if(fo1 != null){
      fo1.m1(fb0, fb1, lb2, fb0);
}
    fb1 = fd0 < fd1;

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
    fd0 = fd1 - fd0;
    Thought lo0 = Thought317.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
        Thought lo1 = Thought193.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
    ab3 = fd1 < fd0;
    fd1 = fd0 - fd1;
    double ld2 = 696.4957918882187;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    Thought lo3 = Thought82.getInstance(fo1, fo0, fo1, fo0);
    double ld4 = 181.66603703795494;
if(fo1 != null){
      ab2 = fo1.m2(ld2, ld4, fd0, fd1);
}
    ab3 = ld2 < ld4;
    ab4 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ld4, fd0, fd1);
}
if(fo0 != null){
      ld2 = fo0.m3();
}
    fb0 = fb1 && ab1;
    Thought lo5 = Thought271.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      ld4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld4, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ld2, ld4, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fd0 = fd1 + ld2;
    Thought lo6 = Thought93.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);

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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
    Thought lo0 = Thought24.getInstance(fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
      lb2 = fo1.m2();
}
    Output.points[7][0] -= ad1;
    fb0 = fb1 || lb1;
    lb2 = !fb0;
    boolean lb3 = false;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb2);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    Thought lo0 = Thought23.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought239.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2();
}
        double ld3 = 817.6248611777227;
        ld3 = ad1 - ad2;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb2, ab1, ab2);
}
        boolean lb4 = false;
        if (ab2) {
            ab3 = !ab4;
            ad3 = ad4 - fd0;
            double ld5 = 744.6692791523693;
            } else if (fb0) {
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 791.7943711551018;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    boolean lb1 = false;
    boolean lb2 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, lb1, lb2, fb0, fb1);
}
    fd0 = fd1 + ld0;
    Thought lo3 = Thought381.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      lb1 = fo1.m2(fd0, fd1, ld0, fd0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      lb2 = fo1.m2();
}
if(ao1 != null){
      ao1.m1(fb0, fb1, lb1, lb2);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, fb1, lb1, lb2, fb0);
}
    Thought lo4 = Thought75.getInstance(fd0, fd1, ld0, fd0, fb1, lb1, lb2, fb0);
    Thought lo5 = Thought286.getInstance(ao1, ao2, ao3, ao4, fb1, lb1, lb2, fb0);
    fd1 = ld0 - fd0;

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
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[7][1] -= ad1;
    boolean lb0 = false;
if(ao1 != null){
      ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(ao2 != null){
      fb0 = ao2.m2();
}
    fb1 = !lb0;
    Thought lo1 = Thought363.getInstance(fb0, fb1, lb0, fb0);
    boolean lb2 = true;
    fb0 = fb1 && lb0;
    Thought lo3 = Thought16.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb0);
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
    ab2 = fd0 > fd1;
    fd0 = fd1 + fd0;
    double ld0 = 379.053717581652;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab1 = fd0 < fd1;
if(fo1 != null){
      ab2 = fo1.m2(ld0, fd0, fd1, ld0);
}
    for(int i0=0; i0<10; i0++){
        ab3 = !ab4;
        fb0 = fb1 || ab1;
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
        fd1 = ld0 - fd0;
if(fo1 != null){
          fo1.m1();
}
        ab3 = ab4 && fb0;
        boolean lb1 = true;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, lb1, ab1);
}
        boolean lb2 = true;
        ab1 = fd1 < ld0;
        ab2 = ab3 && ab4;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, lb1, lb2);
}
        fd1 = ld0 + fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ad1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo0 = Thought55.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      ab3 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ab4 = !fb0;
    fb1 = !ab1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ab2 = fo0.m2();
}
    ab3 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, ab1);
}
    double ld1 = 745.6361161648744;
    Output.points[7][2] -= ld1;
    ab2 = ab3 || ab4;

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
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought209.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, ab1, ab2, ab3);
}
    double ld0 = 789.8266889881673;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab4 = !fb0;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 731.9964882227162;
    double ld1 = 571.9456048091683;
    fb0 = !fb1;
    fb0 = ld0 < ld1;
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought361.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
    Thought lo3 = Thought156.getInstance();
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    boolean lb0 = false;
    ab2 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    Output.points[7][3] += ad2;
    double ld1 = 500.42223216704673;
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, lb0, ab1, ab2, ab3);
}
    boolean lb2 = true;
    Output.points[7][4] += ld1;
    Thought lo3 = Thought177.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb4 = true;
    lb0 = lb2 && lb4;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb2, lb4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
}
    fd0 = fd1 - ld1;
    lb4 = ad1 < ad2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[7][5] += fd0;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
        fd1 = fd0 - fd1;
        fb1 = !fb0;
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4);
}
        fd0 *= -1;
        Thought lo0 = Thought335.getInstance(fd1, fd0, fd1, fd0);
        Output.points[7][6] += fd1;
        fb0 = fb1 && fb0;
        fb1 = fd0 < fd1;
        fb0 = fb1 || fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
        boolean lb1 = true;
        lb1 = !fb0;
        }
    Thought lo2 = Thought335.getInstance();
    boolean lb3 = true;
    Output.points[7][7] += fd0;
    lb3 = fd1 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb3, fb0);
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb3, fb0);
}
    Thought lo4 = Thought223.getInstance(ao1, ao2, ao3, ao4, fb1, lb3, fb0, fb1);
    if (lb3) {
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][8] += ad1;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 - ad4;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
        double ld0 = 390.6730236055798;
        fb0 = ad2 > ad3;
        Thought lo1 = Thought74.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
        fb1 = fb0 || fb1;
        fb0 = ad1 < ad2;
        boolean lb2 = true;
        double ld3 = 534.9813560509018;
        ad2 = ad3 - ad4;
        fb0 = fb1 || lb2;
if(ao2 != null){
          ao1 = ao2.m4();
}
        fb0 = fb1 && lb2;
        Output.points[8][0] -= fd0;
        fd1 = ld0 + ld3;
        fb0 = !fb1;
        lb2 = fb0 || fb1;
if(ao4 != null){
          ao3 = ao4.m4(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
        for(int i1=0; i1<10; i1++){
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    Thought lo0 = Thought111.getInstance(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
    ab1 = !ab2;
    Output.points[8][1] -= fd0;
    Output.points[8][2] += fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab3 = ao2.m2(fd0, fd1, fd0, fd1);
}
    ab4 = fb0 && fb1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
        fd0 = fd1 - fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd0 = ao4.m3(lb1, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return ab4;
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
    ab2 = ad2 < ad3;
    boolean lb0 = true;
    ad4 = fd0 + fd1;
    double ld1 = 353.3409003176458;
    ld1 = ad1 + ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    ab2 = ad1 > ad2;
    boolean lb2 = true;
    double ld3 = 354.0853351926208;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    Thought lo1 = Thought208.getInstance(fd1, fd0, fd1, fd0);
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb2 = true;
    fd0 = fd1 - fd0;
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo1 != null){
      lb2 = fo1.m2(fb0, fb1, lb0, lb2);
}
    fb0 = fd1 > fd0;
    fb1 = lb0 || lb2;
    Output.points[8][3] += fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;

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
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought248.getInstance();
    Thought lo1 = Thought253.getInstance(ab3, ab4, fb0, fb1);
    ab1 = !ab2;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
}
    Thought lo3 = Thought156.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
    ab1 = ab2 || ab3;
    boolean lb4 = true;
    boolean lb5 = false;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    Thought lo6 = Thought328.getInstance(fd1, fd0, fd1, fd0);
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab4 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Thought lo7 = Thought83.getInstance();
    fb0 = !fb1;

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
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    Output.points[8][4] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Thought lo0 = Thought322.getInstance(fd1, ad1, ad2, ad3);
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb1 = ad3 < ad4;
    fb0 = fd0 < fd1;
    ad1 *= -1;
if(fo0 != null){
      fo0.m3();
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Output.points[8][5] += ad3;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2);
}
    Output.points[8][6] -= ad3;
    ad4 = fd0 - fd1;
    Output.points[8][7] -= ad1;
    ad2 = ad3 - ad4;
    fd0 *= -1;
    Thought lo0 = Thought314.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb0 = true;
    lb0 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
        fd0 = fd1 + fd0;
        Thought lo1 = Thought176.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
        fd1 *= -1;
        Output.points[8][8] += fd0;
if(ao3 != null){
          lb0 = ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
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
    Thought lo0 = Thought199.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ad3 = ao1.m3();
}
    Thought lo1 = Thought64.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 > ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
    fb1 = !fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ad1;
    boolean lb2 = false;
if(ao3 != null){
      ad2 = ao3.m3();
}
    lb2 = !fb0;
    ad3 = ad4 + fd0;
if(ao4 != null){
      ao4.m2(fb1, lb2, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    ab1 = !ab2;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought306.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    boolean lb2 = true;
    boolean lb3 = false;
    ab4 = fb0 || fb1;
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, lb2, lb3, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ab3 = fd0 > fd1;
    Thought lo4 = Thought60.getInstance(fd0, fd1, fd0, fd1);
    double ld5 = 237.4163727601406;
    boolean lb6 = true;
    boolean lb7 = false;
    ab2 = !ab3;
    ld5 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld5, fd0, fd1, ld5);
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
    ad1 = ad2 + ad3;
    ab1 = ad4 > fd0;
    Output.points[0][0] += fd1;
if(ao1 != null){
      ao1.m1();
}
    ad1 = ad2 - ad3;
    boolean lb0 = true;
    Output.points[0][1] += ad4;
    fd0 *= -1;
if(ao2 != null){
      ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
    double ld1 = 678.8316074198967;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1, lb0, ab1, ab2, ab3);
}
    double ld2 = 59.04825876721904;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}

Thought.STACK_COUNTER++;
return ld1;
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
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    double ld1 = 233.51982890179025;
    fb0 = fb1 || lb0;
    fd0 *= -1;
    if (fb0) {
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
        fb0 = ld1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb2, lb0, fb0);
}
        fb1 = !lb2;
        double ld3 = 200.14719322140476;
        Thought lo4 = Thought351.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ld1, lb0, fb0, fb1, lb2);
        lb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld3, ld1, fd0, fd1, fb0, fb1, lb2, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb0);
}
        ld3 = ld1 - fd0;
        fd1 = ld3 - ld1;
        Thought lo5 = Thought395.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fo0.m3(fd0, fd1, ld3, ld1);
}
        for(int i0=0; i0<10; i0++){
            fb0 = fd0 > fd1;
            fb1 = lb2 || lb0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ld1, fd0, fd1);
}
if(fo1 != null){
              ld3 = fo1.m3();
}
}}
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
    ab1 = !ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    boolean lb1 = false;
    Output.points[0][2] -= fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought367.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought255.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb1, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    Output.points[0][3] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(ab3, ab4, fb0, fb1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    ad1 = ad2 + ad3;
        boolean lb0 = false;
    ad4 *= -1;
    fd0 = fd1 - ad1;
    lb0 = !fb0;
    ad2 = ad3 + ad4;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Thought lo1 = Thought298.getInstance();
    double ld2 = 641.5702875088998;
if(fo0 != null){
      fo0.m1(fb1, lb0, fb0, fb1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
    boolean lb3 = true;
    Thought lo4 = Thought60.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb3);
    fb0 = fb1 && lb0;
    boolean lb5 = false;

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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !ab1;
    double ld0 = 781.4094343805604;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
    boolean lb2 = false;
    boolean lb3 = false;
    lb2 = !lb3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo4 = Thought198.getInstance(ab1, ab2, ab3, ab4);
    boolean lb5 = false;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    Thought lo0 = Thought99.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought391.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
            fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb2 = false;
    double ld3 = 226.8483470229011;
    if (lb2) {
if(ao1 != null){
          ao1.m2(fb0, fb1, lb2, fb0);
}
        ld3 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld3, fd0, fb1, lb2, fb0, fb1);
}
        boolean lb4 = true;
        fd1 = ld3 + fd0;
        for(int i0=0; i0<10; i0++){
if(ao3 != null){
              ao2 = ao3.m4(fd1, ld3, fd0, fd1, lb4, lb2, fb0, fb1);
}
            boolean lb5 = true;
            ld3 = fd0 - fd1;
}}
Thought.STACK_COUNTER++;
return ao4;
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
    double ld0 = 970.3292765452132;
    ld0 = ad1 + ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld0, ad1, ad2);
}
    fb1 = fb0 && fb1;
        ad3 = ad4 - fd0;
    Output.points[0][4] += fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd1 = ld0 - ad1;
    Output.points[0][5] += ad2;
    for(int i0=0; i0<10; i0++){
        Output.points[0][6] -= ad3;
        fb1 = ad4 < fd0;
        Thought lo1 = Thought371.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd1, ld0, ad1, ad2, fb0, fb1, fb0, fb1);
}
        }
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
    boolean lb2 = true;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    ad4 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ao1;
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
    double ld0 = 442.274004427171;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought103.getInstance(ld0, fd0, fd1, ld0);
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    Output.points[0][7] += fd1;
    ld0 *= -1;
if(ao1 != null){
      ao1.m2();
}
    Output.points[0][8] += fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Output.points[1][0] -= ld0;
    boolean lb2 = false;
    boolean lb3 = true;
    boolean lb4 = true;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, fd0, lb2, lb3, lb4, ab1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 203.90785571645364;
    Output.points[1][1] += ld0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    double ld2 = 257.53717500082655;
    ad4 = fd0 + fd1;
    ab4 = ld0 < ld2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    Thought lo3 = Thought316.getInstance(fb0, fb1, lb1, ab1);
    fd1 = ld0 + ld2;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ld2, ad1, fb1, lb1, ab1, ab2);
}
    ad2 *= -1;
    double ld4 = 628.2591421508608;

Thought.STACK_COUNTER++;
return ao4;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[1][2] += fd1;
    double ld0 = 297.37171238759004;
if(fo1 != null){
      fb1 = fo1.m2(ld0, fd0, fd1, ld0);
}
    Output.points[1][3] += fd0;
    fd1 = ld0 + fd0;
    fd1 = ld0 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought165.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    ld0 *= -1;
    boolean lb2 = true;
    lb2 = !fb0;
    fd0 = fd1 - ld0;

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
    fb0 = fb1 || fb0;
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    Output.points[1][4] += fd0;
    fb0 = !fb1;
    lb0 = !fb0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
    lb2 = fd1 < fd0;

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
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    lb1 = !fb0;
    Thought lo2 = Thought88.getInstance(fb1, lb0, lb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
    fb1 = !lb0;
    Thought lo3 = Thought339.getInstance(fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
    Output.points[1][5] -= fd0;
    lb1 = fb0 || fb1;
    Output.points[1][6] += fd1;
    Thought lo4 = Thought76.getInstance(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
    boolean lb5 = false;
    lb0 = fd0 < fd1;
    Thought lo6 = Thought344.getInstance(fo0, fo1, fo0, fo1);

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
