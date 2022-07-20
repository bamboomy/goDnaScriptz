package genetic;
import java.util.ArrayList;
class Thought260 extends Thought{
private static ArrayList<Thought260> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 781.6766071550007;
private double fd1 = 792.3363068590197;
private Thought fo0 = null;
private Thought fo1 = null;
Thought260 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought260 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought260 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought260 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought260 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought260 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought260 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought260 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought260 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought260 instance = new Thought260 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought260 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought260 instance = new Thought260 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought260 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought260 instance = new Thought260 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought260 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought260 instance = new Thought260 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought260 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought260 instance = new Thought260 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought260 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought260 instance = new Thought260 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought260 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought260 instance = new Thought260 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought260 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought260 instance = new Thought260 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
        fb0 = !fb1;
    lb0 = fd0 < fd1;
    fb0 = fb1 && lb0;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought173.getInstance();
    boolean lb2 = true;
    lb0 = lb2 || fb0;
    fb1 = lb0 || lb2;
    Thought lo3 = Thought287.getInstance(fb0, fb1, lb0, lb2);
    double ld4 = 59.9712237694341;
    double ld5 = 189.26670031984693;
    double ld6 = 883.9032894543894;
    ld5 = ld6 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld4, ld5, ld6, fb0, fb1, lb0, lb2);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
        if (fb1) {
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            ab1 = !ab2;
if(fo1 != null){
              fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
            double ld0 = 978.7815803767626;
            ab3 = ab4 && fb0;
            double ld1 = 239.15410815096678;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
    fd1 = ad1 + ad2;
    fb0 = fb1 && fb0;
    ad3 *= -1;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    double ld0 = 383.21133600278023;
    Output.points[2][2] += ad2;
    double ld1 = 152.89301526328865;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld2 = 693.552758596977;
    Thought lo3 = Thought136.getInstance(fb1, fb0, fb1, fb0);
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;

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
    ab2 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
        fd0 = fd1 - ad1;
    Thought lo0 = Thought254.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    lb1 = ad2 < ad3;
    Thought lo2 = Thought200.getInstance(ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    lb3 = ad3 < ad4;
    fd0 = fd1 + ad1;
    for(int i0=0; i0<10; i0++){
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][3] += fd1;
    fd0 *= -1;
    boolean lb0 = false;
    lb0 = fd1 > fd0;
    boolean lb1 = true;
if(ao1 != null){
      lb1 = ao1.m2();
}
    Thought lo2 = Thought175.getInstance(fb0, fb1, lb0, lb1);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    lb1 = fb0 || fb1;
    lb0 = !lb1;
    boolean lb3 = true;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb0);
}
    double ld4 = 354.2127614995488;
    ld4 = fd0 + fd1;
if(ao2 != null){
      ld4 = ao2.m3(ao3, ao4, fo0, fo1, lb1, lb3, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld4, fd0);
}
    lb0 = fd1 < ld4;
    fd0 *= -1;
    boolean lb5 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld4, fd0, fd1);
}
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      ld4 = ao3.m3(lb1, lb3, lb5, fb0);
}
    fb1 = !lb0;
    double ld6 = 178.3944712508989;
    lb1 = ld6 > fd0;
    lb3 = !lb5;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld4, ld6, fd0, fb1, lb0, lb1, lb3);
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
if(ao1 != null){
      fb1 = ao1.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
    ad2 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    Thought lo0 = Thought228.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
    fb1 = fd0 > fd1;
    double ld1 = 798.3852411357433;
    boolean lb2 = true;

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
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ab1 = ao4.m2(ab2, ab3, ab4, fb0);
}
    double ld0 = 626.0072892687284;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
    boolean lb2 = true;
    fd0 = fd1 - ld0;
    fd0 *= -1;
    if (ab1) {
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
        boolean lb3 = true;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb3, lb1);
}
        Thought lo4 = Thought287.getInstance(ao1, ao2, ao3, ao4);
        Output.points[2][4] -= ld0;
        fd0 = fd1 + ld0;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
        ld0 = fd0 - fd1;
        ld0 = fd0 - fd1;
if(ao1 != null){
          ld0 = ao1.m3();
}
if(ao2 != null){
          fd0 = ao2.m3(lb2, ab1, ab2, ab3);
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
      ab1 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Output.points[2][5] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = fd1 < ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    Output.points[2][6] -= ad1;
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo1 = Thought52.getInstance(ab2, ab3, ab4, fb0);
    fb1 = fd1 < ad1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    ad3 *= -1;
    lb0 = !ab1;
    ab2 = ab3 && ab4;
    double ld2 = 812.6375517460627;
    fb0 = fb1 || lb0;

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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 172.97299453738677;
    fb1 = fb0 && fb1;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    Output.points[2][7] += fd1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    double ld2 = 843.6197472370843;
    fb1 = ld0 > ld2;
    boolean lb3 = false;
    lb1 = lb3 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ld2);
}
    boolean lb4 = false;
    Thought lo5 = Thought76.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      lb1 = fo1.m2(lb3, lb4, fb0, fb1);
}
    lb1 = fd0 < fd1;
    lb3 = ld0 < ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, lb4, fb0, fb1, lb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld2, fd0, lb3, lb4, fb0, fb1);
}
    fd1 = ld0 + ld2;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, lb3, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb6 = false;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, ld2);
}

Thought.STACK_COUNTER++;
return lb1;
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
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      ab1 = fo0.m2();
}
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb0;
    double ld1 = 212.98435555819145;
    ab1 = fd0 < fd1;
    ab2 = ld1 > fd0;
    ab3 = ab4 || fb0;
    Thought lo2 = Thought159.getInstance(fb1, lb0, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb3);
}
    ab1 = !ab2;
    double ld4 = 118.47149667262042;
    Output.points[2][8] -= ld4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m3(fd1, ld1, ld4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld4, fd0);
}
if(fo1 != null){
      fo1.m3();
}
    boolean lb5 = false;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb0, lb3, lb5);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ld4, fd0, fd1, ab1, ab2, ab3, ab4);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd0 = fd1 - ad1;
    lb0 = fb0 || fb1;
    lb0 = ad2 > ad3;
    double ld1 = 772.8464704704526;
    ad3 = ad4 + fd0;
    fd1 = ld1 - ad1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    ad2 *= -1;
    Output.points[3][0] += ad3;
    Output.points[3][1] += ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
if(fo1 != null){
      fo1.m3();
}
    boolean lb2 = false;
    Thought lo3 = Thought281.getInstance(lb2, fb0, fb1, lb0);
    lb2 = !fb0;
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, ad1, ad2, lb4, fb0, fb1, lb0);
}
    boolean lb5 = true;
    lb2 = !lb4;

Thought.STACK_COUNTER++;
return lb5;
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
    if (ab1) {
        ab2 = ad2 < ad3;
        Thought lo0 = Thought227.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
        ab1 = ab2 && ab3;
        Thought lo1 = Thought176.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
        ab4 = fb0 || fb1;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m3(ab1, ab2, ab3, ab4);
}
        double ld2 = 848.8393861642265;
        ld2 = ad1 + ad2;
        fb0 = !fb1;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        if (fb0) {
            Thought lo3 = Thought33.getInstance(ld2, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || fb0;
    Output.points[3][2] -= fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 *= -1;
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought173.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    Output.points[3][3] += fd1;
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}

Thought.STACK_COUNTER++;
return lb0;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = ad2 < ad3;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought345.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    fd1 *= -1;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m2();
}
    fb1 = !fb0;
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ad1 *= -1;
        Output.points[3][4] += ad2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        double ld0 = 62.23392369432816;
        ld0 = fd0 - fd1;
        ld0 *= -1;
if(ao3 != null){
          ao3.m2(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
        fd1 = ld0 + fd0;
        for(int i0=0; i0<10; i0++){
if(ao4 != null){
              ab2 = ao4.m2(fo0, fo1, ao1, ao2);
}
            ab3 = fd1 < ld0;
}}
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
    ad2 = ad3 - ad4;
    double ld0 = 174.7670093622261;
    ab1 = ad4 < fd0;
    fd1 *= -1;
    Output.points[3][5] -= ld0;
    boolean lb1 = true;
    ad1 = ad2 + ad3;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ld0, ad1);
}
    ab1 = ad2 > ad3;
    double ld2 = 415.38601394537625;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
        boolean lb3 = true;
if(ao2 != null){
      ao2.m3();
}
    ld0 *= -1;
    ab1 = ab2 || ab3;
    boolean lb4 = true;
    ab3 = ab4 || fb0;
    double ld5 = 80.32830434182898;
    Output.points[3][6] += ld2;
if(ao3 != null){
      ao3.m2(fb1, lb1, lb3, lb4);
}
    ab1 = ab2 && ab3;
    ld5 = ad1 + ad2;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
    lb3 = lb4 || ab1;
    boolean lb6 = false;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        lb0 = !fb0;
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        fb1 = fd1 < fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        lb0 = fb0 && fb1;
        boolean lb1 = true;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
    Thought lo0 = Thought96.getInstance();
    double ld1 = 590.0420961754796;
    double ld2 = 3.0795305189524336;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ld2 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, ld2, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ld2, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought209.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld1 = 20.518009492746536;
    Thought lo2 = Thought347.getInstance(fo1, fo0, fo1, fo0);
    Thought lo3 = Thought89.getInstance(ad4, fd0, fd1, ld1);
    Output.points[3][7] -= ad1;
    boolean lb4 = true;
    fb0 = !fb1;
    Thought lo5 = Thought147.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb4 = fd1 < ld1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb4, fb0);
}
    fb1 = lb4 && fb0;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb4, fb0, fb1);
}
if(fo0 != null){
      lb4 = fo0.m2(fd1, ld1, ad1, ad2, fb0, fb1, lb4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb4, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 *= -1;
    ab1 = !ab2;
    double ld0 = 972.5363732988961;
    boolean lb1 = false;
    ad1 = ad2 - ad3;
    ab2 = ab3 || ab4;
    Thought lo2 = Thought258.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fb1 || lb1;
if(fo1 != null){
      ab1 = fo1.m2(ad4, fd0, fd1, ld0);
}
    Output.points[3][8] -= ad1;
    ad2 = ad3 + ad4;
    boolean lb3 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
    Thought lo0 = Thought178.getInstance(fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[4][0] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    Thought lo1 = Thought29.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
        ad2 *= -1;
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    boolean lb2 = true;
    lb1 = lb2 && fb0;
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, lb0, lb1, lb2);
}
    double ld3 = 350.9920489708944;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || lb0;
    lb1 = ad3 < ad4;
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld3, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    lb2 = ld3 > ad1;
    fb0 = fb1 && lb0;
    lb1 = lb2 && fb0;
    fb1 = lb0 || lb1;
    lb2 = fb0 || fb1;
    ad2 = ad3 - ad4;
    double ld4 = 840.1140378758224;
    if (lb0) {
        Thought lo5 = Thought31.getInstance();
if(ao3 != null){
          ao3.m1(lb1, lb2, fb0, fb1);
}
        Thought lo6 = Thought7.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld3, lb0, lb1, lb2, fb0);
if(ao3 != null){
          ao2 = ao3.m4(ld4, ad1, ad2, ad3, fb1, lb0, lb1, lb2);
}
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
    ab2 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[4][1] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    if (lb0) {
        ab1 = fd1 < fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          ao4 = fo0.m4();
}
if(fo1 != null){
          fd1 = fo1.m3(ab2, ab3, ab4, fb0);
}
        fb1 = fd0 > fd1;
        boolean lb1 = true;
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb0, ab1, ab2);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, lb1, lb0, ab1, ab2);
}
        double ld2 = 994.7444773891658;
        ld2 *= -1;
        ab3 = ab4 || fb0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb1 = fd0 > fd1;
if(ao2 != null){
          lb1 = ao2.m2(ld2, fd0, fd1, ld2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][2] -= ad1;
    Output.points[4][3] -= ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab2 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    double ld0 = 104.49269193740672;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ab1 = ld0 < ad1;
    ab2 = ad2 > ad3;
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        if (fb0) {
if(fo0 != null){
              fd0 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb1, ab1, ab2);
}
}}
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    Thought lo1 = Thought286.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      fb0 = fo1.m2();
}
    Thought lo2 = Thought124.getInstance(fb1, lb0, fb0, fb1);
    lb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fd0 *= -1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought33.getInstance(fo0, fo1, fo0, fo1);

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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought344.getInstance();
    ab2 = !ab3;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Output.points[4][4] -= fd0;
    Output.points[4][5] -= fd1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m1(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
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
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3);
}
    Output.points[4][6] -= ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb2 = false;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb1, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, lb1, lb2, fb0);
}
    ad4 *= -1;
    boolean lb3 = false;
    Thought lo4 = Thought264.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
    boolean lb5 = true;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, lb2, lb3, lb5, fb0);
}
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
    fb1 = lb0 || lb1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(lb3, lb5, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, lb1, lb2, lb3);
}
    fd0 = fd1 - ad1;

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
    ab1 = !ab2;
    double ld0 = 605.5083941197026;
    boolean lb1 = false;
        Thought lo2 = Thought370.getInstance(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
    Thought lo3 = Thought239.getInstance(fo1, fo0, fo1, fo0);
    ab3 = !ab4;
    fb0 = fd0 > fd1;
    if (fb1) {
        ld0 = ad1 - ad2;
        boolean lb4 = false;
        lb4 = ad3 < ad4;
        lb1 = !ab1;
        boolean lb5 = true;
        ab1 = fd0 < fd1;
        ld0 = ad1 - ad2;
        ad3 = ad4 - fd0;
        boolean lb6 = false;
        fd1 = ld0 + ad1;
        ad2 = ad3 - ad4;
        fd0 = fd1 + ld0;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
        ab1 = !ab2;
        ab3 = ab4 || fb0;
        boolean lb7 = false;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    double ld0 = 608.4507486096423;
    fd0 = fd1 - ld0;
    Thought lo1 = Thought166.getInstance();
    fb1 = fb0 || fb1;
    fd0 *= -1;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fd1 = ld0 + fd0;
    boolean lb2 = false;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ld0, fd0, fd1, ld0, lb2, fb0, fb1, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb2, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    ld0 *= -1;
    fb1 = fd0 > fd1;
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      lb2 = ao3.m2();
}
    fb0 = !fb1;

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
    fb0 = !fb1;
    fb0 = !fb1;
    Thought lo0 = Thought160.getInstance(fb0, fb1, fb0, fb1);
    ad1 *= -1;
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld1 = 274.95639004351364;
if(ao1 != null){
      ad4 = ao1.m3(fd0, fd1, ld1, ad1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb2, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld3 = 892.7636689531386;
    fb1 = ad1 < ad2;
    ad3 *= -1;
    Thought lo4 = Thought152.getInstance(ad4, fd0, fd1, ld1);
    lb2 = ld3 < ad1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m1();
}

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
    fd1 = fd0 - fd1;
        ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld0 = 409.70157393570946;
if(ao4 != null){
      ld0 = ao4.m3(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3);
}
    fd1 = ld0 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, fd0, fd1);
}
    ab3 = ld0 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
    boolean lb1 = true;
    ld0 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3();
}
    fd0 *= -1;
        ab3 = fd1 < ld0;
    fd0 *= -1;
    boolean lb2 = true;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, lb1);
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
    boolean lb0 = true;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    Output.points[4][7] += ad2;
    Thought lo2 = Thought46.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
    boolean lb3 = false;
    Thought lo4 = Thought5.getInstance(ao1, ao2, ao3, ao4, lb1, lb3, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}

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
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    Output.points[4][8] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
    lb1 = fb0 || fb1;
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    lb0 = lb1 || lb2;
    fb0 = fd0 < fd1;
        fd0 = fd1 + fd0;
    fd1 *= -1;
    fb1 = !lb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    fd1 *= -1;
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
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    double ld0 = 421.9034253312971;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought170.getInstance(fd1, ld0, fd0, fd1);
    boolean lb2 = true;
    Output.points[5][0] -= ld0;
    fb0 = !fb1;
    boolean lb3 = true;
    lb2 = !lb3;
    fd0 *= -1;
    Thought lo4 = Thought194.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
if(fo1 != null){
      ld0 = fo1.m3();
}
    Output.points[5][1] -= fd0;
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb5, fb0, fb1, lb2);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb3, lb5, fb0, fb1);
}
    Output.points[5][2] += fd0;
    lb2 = lb3 || lb5;
    boolean lb6 = false;
    fd1 *= -1;

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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    Thought lo1 = Thought386.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    fd1 *= -1;
    fb0 = fd0 > fd1;
    fb1 = !lb0;
    fd0 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fb1 = !lb0;
    boolean lb2 = false;
    lb2 = fd1 < fd0;
    boolean lb3 = false;
    lb3 = !fb0;
    fb1 = !lb0;
    Thought lo4 = Thought160.getInstance();
    lb2 = !lb3;

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
