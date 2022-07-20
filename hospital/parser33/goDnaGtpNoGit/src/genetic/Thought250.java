package genetic;
import java.util.ArrayList;
class Thought250 extends Thought{
private static ArrayList<Thought250> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 536.2493461697841;
private double fd1 = 176.87822989645105;
private Thought fo0 = null;
private Thought fo1 = null;
Thought250 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought250 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought250 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought250 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought250 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought250 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought250 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought250 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought250 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought250 instance = new Thought250 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought250 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought250 instance = new Thought250 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought250 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought250 instance = new Thought250 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought250 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought250 instance = new Thought250 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought250 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought250 instance = new Thought250 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought250 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought250 instance = new Thought250 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought250 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought250 instance = new Thought250 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought250 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought250 instance = new Thought250 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        Thought lo1 = Thought247.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought243.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    boolean lb3 = false;
    double ld4 = 156.80625222553718;
    fd0 = fd1 - ld4;
    for(int i0=0; i0<10; i0++){
        boolean lb5 = true;
        lb0 = lb3 || fb0;
        double ld6 = 428.6428898413121;
        fb1 = lb5 || lb0;
if(fo0 != null){
          ld4 = fo0.m3(fo1, fo0, fo1, fo0);
}
        double ld7 = 449.23260806957745;
        Output.points[3][8] += ld4;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fd1, ld6, ld7, ld4);
}
        lb3 = fd0 > fd1;
        fb0 = ld6 < ld7;
        ld4 = fd0 + fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ld6, ld7, ld4, fd0);
}
        fd1 = ld6 - ld7;
        Output.points[4][0] -= ld4;
if(fo0 != null){
          fo0.m1();
}
if(fo1 != null){
          fo1.m2(fb1, lb5, lb0, lb3);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought354.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    ab2 = fd0 > fd1;
    double ld2 = 389.94670486428845;
    ld2 = fd0 - fd1;
    ab3 = ld2 < fd0;
    ab4 = fd1 > ld2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ld2;
        boolean lb3 = true;
        if (ab4) {
            fd0 = fd1 + ld2;
            double ld4 = 375.44569816929055;
            ld2 = fd0 + fd1;
            double ld5 = 202.08241315708605;
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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
    Thought lo1 = Thought221.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = lb0 && fb0;
    Thought lo2 = Thought181.getInstance(fb1, lb0, fb0, fb1);
    Thought lo3 = Thought213.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
    boolean lb4 = false;
    lb4 = !fb0;
    boolean lb5 = true;
    ad4 = fd0 + fd1;
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb6, fb0, fb1, lb0);
}
    lb4 = lb5 || lb6;
    fb0 = fb1 && lb0;
    lb4 = fd0 > fd1;
    double ld7 = 544.4496569569078;
    ld7 = ad1 - ad2;
    lb5 = !lb6;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb4);
}
    boolean lb8 = false;
    Thought lo9 = Thought220.getInstance(fo1, fo0, fo1, fo0);
    if (lb5) {
        boolean lb10 = false;
if(fo1 != null){
          fo1.m2(fd1, ld7, ad1, ad2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought366.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
    Thought lo2 = Thought225.getInstance(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
    ab1 = ad3 < ad4;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
    boolean lb3 = false;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld4 = 710.366220175605;
    fb1 = ad4 < fd0;
    fd1 = ld4 + ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld4, ad1);
}
    lb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld4);
}
    Output.points[4][1] -= ad1;
if(fo0 != null){
      fo0.m1();
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
    fb1 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 830.4670842369428;
    fb0 = !fb1;
if(ao4 != null){
      ao4.m2(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    Thought lo1 = Thought13.getInstance(fd0, fd1, ld0, fd0);
    Output.points[4][2] += fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        double ld3 = 413.2771259097803;
        ld3 = ld0 - fd0;
        Thought lo4 = Thought339.getInstance(fb0, fb1, lb2, fb0);
if(fo1 != null){
          fb1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ld3, ld0, fd0, lb2, fb0, fb1, lb2);
}
        fd1 *= -1;
        Thought lo5 = Thought270.getInstance(ld3, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
        double ld6 = 73.61618074843324;
        boolean lb7 = false;
        ld3 = ld6 - ld0;
        fd0 = fd1 - ld3;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb7, lb2);
}
        fb0 = fb1 || lb7;
        lb2 = fb0 || fb1;
        lb7 = ld6 > ld0;
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
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    Thought lo0 = Thought116.getInstance(ao1, ao2, ao3, ao4);
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[4][3] += ad3;
    Thought lo1 = Thought130.getInstance(ao3, ao4, fo0, fo1);
    fb1 = fb0 && fb1;
    boolean lb2 = false;
    lb2 = fb0 && fb1;
    Thought lo3 = Thought394.getInstance(ad4, fd0, fd1, ad1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    lb2 = fd1 > ad1;
    ad2 *= -1;
    fb0 = ad3 < ad4;
    Thought lo4 = Thought74.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb2, fb0, fb1);
}
    fd0 = fd1 - ad1;
    if (lb2) {
        Thought lo5 = Thought325.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb2, fb0);
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
    double ld0 = 57.274047128231274;
    fd0 *= -1;
    fd1 = ld0 + fd0;
    fd1 = ld0 + fd0;
    ab1 = fd1 < ld0;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = !ab3;
    Output.points[4][4] += ld0;
    ab4 = fb0 || fb1;
    double ld1 = 998.0248965998727;
    ab1 = ab2 && ab3;
    if (ab4) {
        double ld2 = 24.38262814740351;
        double ld3 = 850.2807822346823;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
        ab3 = ld3 < ld0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        for(int i0=0; i0<10; i0++){
            ld1 = fd0 - fd1;
if(ao2 != null){
              ao1 = ao2.m4(ld2, ld3, ld0, ld1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    ad1 *= -1;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    if (fb1) {
        ad3 = ad4 - fd0;
        ab1 = fd1 < ad1;
        ab2 = ad2 < ad3;
        boolean lb0 = true;
        ad4 = fd0 - fd1;
        boolean lb1 = true;
        double ld2 = 658.8134726184011;
        ab1 = !ab2;
        ab3 = ab4 || fb0;
        Output.points[4][5] += ld2;
if(ao1 != null){
          fo1 = ao1.m4();
}
        ad1 = ad2 + ad3;
        Output.points[4][6] -= ad4;
        fd0 = fd1 - ld2;
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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    Output.points[4][7] -= fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
    Thought lo2 = Thought291.getInstance(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
    Output.points[4][8] += fd0;
    double ld3 = 318.319105870274;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = fb0 || fb1;
    Output.points[5][0] += fd0;
if(fo0 != null){
      fo0.m1(fd1, ld3, fd0, fd1);
}
    boolean lb4 = false;
    ld3 = fd0 - fd1;
    ld3 *= -1;
    lb0 = lb1 || lb4;
        fd0 = fd1 - ld3;
    fb0 = fd0 < fd1;
    fb1 = lb0 || lb1;
    Thought lo5 = Thought299.getInstance(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
    lb4 = fd0 > fd1;
    ld3 = fd0 + fd1;
    ld3 *= -1;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    ab3 = ab4 || fb0;
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[5][1] -= fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}

Thought.STACK_COUNTER++;
return ab2;
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
    ad2 = ad3 + ad4;
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    Thought lo1 = Thought51.getInstance(lb0, fb0, fb1, lb0);
    boolean lb2 = false;
    Thought lo3 = Thought369.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
    if (lb2) {
        fb0 = fb1 && lb0;
        boolean lb4 = false;
if(fo0 != null){
          lb0 = fo0.m2(fd0, fd1, ad1, ad2, lb2, fb0, fb1, lb4);
}
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
        lb4 = lb0 && lb2;
        boolean lb5 = false;
        lb2 = !fb0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
if(fo0 != null){
          fo0.m2();
}
        lb4 = lb5 && lb0;
if(fo1 != null){
          fo1.m2(lb2, fb0, fb1, lb4);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb5, lb0, lb2, fb0);
}
        boolean lb6 = true;
        boolean lb7 = false;
if(fo1 != null){
          lb2 = fo1.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb4, lb5);
}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && lb0;
    boolean lb1 = false;
    double ld2 = 744.6804579732894;
    ld2 *= -1;
    lb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    ab3 = !ab4;
    fd0 = fd1 + ld2;
    Thought lo3 = Thought310.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fd0 = fo0.m3(fb0, fb1, lb0, lb1);
}
        fd1 = ld2 - ad1;
        ab1 = ad2 < ad3;
        boolean lb4 = false;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
}
            fb0 = ad1 < ad2;
            Thought lo5 = Thought343.getInstance(ad3, ad4, fd0, fd1, fb1, lb4, lb0, lb1);
            ab1 = !ab2;
            ld2 = ad1 - ad2;
            ad3 = ad4 - fd0;
            ab3 = ab4 && fb0;
            fb1 = fd1 > ld2;
}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought165.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    lb1 = lb2 || fb0;
    fd0 *= -1;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Thought lo3 = Thought186.getInstance(fo1, ao1, ao2, ao3);
    double ld4 = 83.8120377554643;
    fb1 = fd0 < fd1;
    if (lb1) {
        lb2 = fb0 && fb1;
        Thought lo5 = Thought79.getInstance(ld4, fd0, fd1, ld4);
        Output.points[5][2] += fd0;
        double ld6 = 210.82064053657425;
        boolean lb7 = false;
        Thought lo8 = Thought82.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld6, ld4);
        double ld9 = 578.4616171319199;
}
Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
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
      ao2 = ao3.m4();
}
    ad1 = ad2 - ad3;
    double ld0 = 805.259064545407;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought347.getInstance(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought49.getInstance(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    fb1 = ad4 < fd0;
    fd1 = ld0 + ad1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ld0;
    fb0 = ad1 < ad2;
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ad3 = ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
        boolean lb3 = true;
        ad4 = fd0 - fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0);
}
    Output.points[5][3] -= fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3();
}
    double ld0 = 45.194358090421936;
    ab1 = ld0 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld2 = 700.8738562444806;
    fb1 = lb1 && ab1;

Thought.STACK_COUNTER++;
return ab2;
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
    ab2 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    if (ab3) {
if(ao4 != null){
          ab4 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
        Thought lo0 = Thought109.getInstance();
        ad3 *= -1;
if(ao3 != null){
          ad4 = ao3.m3(fb0, fb1, ab1, ab2);
}
        boolean lb1 = false;
        Output.points[5][4] -= fd0;
        if (ab2) {
            boolean lb2 = false;
            fd1 = ad1 + ad2;
            boolean lb3 = true;
            Output.points[5][5] += ad3;
if(ao4 != null){
              ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
              ao3.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb2, lb3);
}
            boolean lb4 = true;
            lb4 = lb1 || ab1;
            double ld5 = 302.623348409819;
if(ao4 != null){
              ab2 = ao4.m2(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
            ld5 = ad1 + ad2;
            lb2 = ad3 < ad4;
            fd0 = fd1 + ld5;
            } else {
            ab1 = !ab2;
            boolean lb6 = true;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][6] += fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = true;
if(fo0 != null){
          fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        if (fb1) {
            fd1 = fd0 - fd1;
            Output.points[5][7] -= fd0;
            fd1 = fd0 - fd1;
            fd0 = fd1 - fd0;
            lb0 = fd1 < fd0;
            fd1 = fd0 - fd1;
}}
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
    boolean lb0 = false;
    Output.points[5][8] += fd1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = fd0 > fd1;
    ab3 = fd0 < fd1;
    Thought lo1 = Thought384.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1();
}
    fd1 *= -1;
    double ld2 = 104.4630272320589;
    ab4 = fb0 || fb1;
    lb0 = ld2 > fd0;
    ab1 = ab2 || ab3;
    Thought lo3 = Thought315.getInstance(ab4, fb0, fb1, lb0);
    fd1 = ld2 + fd0;
    double ld4 = 635.9332058588597;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld4, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
        Output.points[6][0] += fd1;
    Thought lo5 = Thought106.getInstance(ld2, ld4, fd0, fd1, fb0, fb1, lb0, ab1);
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb0 = ld2 > ld4;
    Thought lo6 = Thought47.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 - ld2;
    ld4 *= -1;
    ab1 = fd0 > fd1;
    boolean lb7 = false;

Thought.STACK_COUNTER++;
return ld2;
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
    fb0 = ad2 > ad3;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    double ld0 = 936.6821582486297;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    boolean lb1 = true;
    lb1 = ld0 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = ld0 > ad1;
    fb1 = ad2 > ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld2 = 781.6559604254772;
    ad3 = ad4 + fd0;
    boolean lb3 = false;
    fd1 = ld0 + ld2;
    ad1 *= -1;
    lb1 = !lb3;
    fb0 = fb1 || lb1;
    boolean lb4 = false;
    lb3 = lb4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, lb3, lb4);
}
    double ld5 = 732.4410364199497;
    Thought lo6 = Thought189.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb3);

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
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    double ld0 = 841.3957358583372;
    ab3 = ab4 || fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(ad4, fd0, fd1, ld0);
}
        double ld1 = 30.21576705380408;
        fb1 = ld0 < ad1;
        ab1 = ad2 < ad3;
        ab2 = ad4 > fd0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, ld0, ad1);
}
        ab3 = ad2 < ad3;
        ab4 = fb0 || fb1;
if(fo0 != null){
          ab1 = fo0.m2();
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    lb1 = !fb0;
    Thought lo2 = Thought230.getInstance(fb1, lb0, lb1, fb0);
    fb1 = fd1 < fd0;
    lb0 = fd1 > fd0;
    boolean lb3 = true;
    lb1 = lb3 || fb0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb3);
}
    fb0 = fb1 || lb0;
    boolean lb4 = true;
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, lb1, lb3, lb4, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
        ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
return ad2;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 103.76908907176916;
if(ao1 != null){
          ld0 = ao1.m3(fd0, fd1, ld0, fd0);
}
        ab2 = ab3 || ab4;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
        for(int i1=0; i1<10; i1++){
if(ao1 != null){
              ao1.m2();
}
if(ao3 != null){
              ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
if(ao4 != null){
              ao4.m2(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
              ao3 = ao4.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
            fb0 = fd1 < ld0;
            fd0 = fd1 + ld0;
            fb1 = ab1 && ab2;
            ab3 = fd0 > fd1;
            boolean lb1 = true;
if(fo0 != null){
              fo0.m1(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
            }
        ld0 = fd0 - fd1;
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
    boolean lb0 = false;
    ad2 *= -1;
    ad3 = ad4 - fd0;
    lb0 = !ab1;
    fd1 = ad1 - ad2;
    ab2 = ab3 || ab4;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[6][1] -= fd1;
    ad1 = ad2 - ad3;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought213.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab4 = fd1 < fd0;
    fb0 = !fb1;
    ab1 = !ab2;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    double ld1 = 746.9837857425082;
    Thought lo2 = Thought352.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ld1;
    lb0 = !ab1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[6][2] -= fd1;
    boolean lb3 = false;
    fb0 = !fb1;
    lb0 = lb3 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought262.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, lb3, ab1);
    ab2 = fd0 < fd1;
    ld1 = fd0 + fd1;
    double ld5 = 141.00086847935052;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab3 = ld5 < fd0;

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
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    Output.points[6][3] += ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb1 = ad3 < ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo1 != null){
      ad2 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
        ad1 = ad2 - ad3;
    lb0 = fb0 || fb1;
    Thought lo1 = Thought137.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    boolean lb3 = true;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad4 = fd0 - fd1;
    double ld4 = 662.6548663357728;
    boolean lb5 = true;
    Output.points[6][4] += ld4;
if(fo1 != null){
      lb2 = fo1.m2(ad1, ad2, ad3, ad4);
}
    double ld6 = 750.1598573087687;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld4);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1();
}
    ab1 = !ab2;
if(fo0 != null){
      ad2 = fo0.m3(ab3, ab4, fb0, fb1);
}
    ad3 = ad4 + fd0;
    boolean lb0 = false;
    lb0 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought151.getInstance(fo1, fo0, fo1, fo0);
    boolean lb2 = true;
    ab1 = ab2 || ab3;
    ab4 = ad2 > ad3;
    Output.points[6][5] -= ad4;
    fd0 *= -1;
    fd1 = ad1 - ad2;

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
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3();
}
    double ld0 = 336.68325345581127;
    boolean lb1 = false;
if(fo0 != null){
      ao4 = fo0.m4(lb1, fb0, fb1, lb1);
}
    Thought lo2 = Thought134.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
if(ao4 != null){
      ao4.m1(fd1, ld0, fd0, fd1, fb1, lb1, fb0, fb1);
}
    lb1 = fb0 || fb1;
    boolean lb3 = false;
    lb1 = !lb3;
    ld0 = fd0 - fd1;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb3, fb0, fb1, lb1);
}
    double ld4 = 295.6965016327989;
    boolean lb5 = false;
    boolean lb6 = true;
    lb3 = !lb5;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    boolean lb7 = true;
if(fo0 != null){
      ao4 = fo0.m4(ld0, ld4, fd0, fd1);
}
if(fo1 != null){
      lb6 = fo1.m2(ao1, ao2, ao3, ao4, ld0, ld4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(lb7, fb0, fb1, lb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ld0, ld4, fd0, fd1, lb3, lb5, lb6, lb7);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        ad1 = ad2 + ad3;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
}
    ad2 *= -1;
    boolean lb2 = true;
    lb1 = ad3 > ad4;
    boolean lb3 = true;
    lb2 = lb3 || fb0;
    fb1 = lb0 && lb1;
    Thought lo4 = Thought330.getInstance(ao3, ao4, fo0, fo1, lb2, lb3, fb0, fb1);
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    lb0 = lb1 || lb2;
    boolean lb5 = false;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    lb3 = lb5 && fb0;
    boolean lb6 = false;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fb0 = ao1.m2();
}
    Output.points[6][6] -= fd0;
    double ld7 = 553.9549990590103;
    fd0 *= -1;
    Thought lo8 = Thought310.getInstance(fb1, lb0, lb1, lb2);
    Output.points[6][7] += fd1;
    lb3 = lb5 || lb6;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    double ld0 = 843.8479862507357;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ld0;
    boolean lb2 = true;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb2);
}
    fd1 *= -1;
        ld0 = fd0 - fd1;
    ab1 = !ab2;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld3 = 620.7376472172364;
    ld0 = ld3 - fd0;
    Output.points[6][8] += fd1;
    ld0 = ld3 - fd0;
if(ao1 != null){
      ao1.m2(fd1, ld0, ld3, fd0);
}
    ab4 = fb0 && fb1;

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
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    Output.points[7][0] -= ad1;
    ab3 = ab4 || fb0;
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + ad1;
if(fo1 != null){
          fb1 = fo1.m2();
}
        }
    ab1 = ab2 || ab3;
    boolean lb0 = true;
    double ld1 = 16.67636302350959;
    ab3 = ab4 || fb0;
if(ao1 != null){
      ad1 = ao1.m3(fb1, lb0, ab1, ab2);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
if(ao1 != null){
      lb0 = ao1.m2(fd1, ld1, ad1, ad2, lb2, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0);
}
    lb2 = !ab1;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
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
      fo0 = fo1.m4();
}
    fd1 *= -1;
        fd0 = fd1 + fd0;
    fd1 *= -1;
    Output.points[7][1] += fd0;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fd1 = fd0 - fd1;
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    fd1 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = !fb1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
    Thought lo1 = Thought123.getInstance(fo1, fo0, fo1, fo0);
    fb0 = !fb1;
    Thought lo2 = Thought93.getInstance(fd0, fd1, fd0, fd1);
    lb0 = fb0 && fb1;
    lb0 = fb0 || fb1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb0 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    lb0 = fd1 > fd0;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    fb1 = fd0 < fd1;
    lb0 = fd0 > fd1;
    Output.points[7][2] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        double ld3 = 607.5525199927702;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, ld3, fd0);
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
    Thought lo0 = Thought41.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    Output.points[7][3] -= fd0;
    double ld1 = 216.7677854126715;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && lb2;
    Thought lo3 = Thought86.getInstance(fb0, fb1, lb2, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb2, fb0, fb1);
}
    boolean lb4 = false;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0, lb2, lb4, fb0, fb1);
}
    lb2 = fd1 < ld1;
    fd0 *= -1;
        lb4 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb2, lb4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    fb1 = fd0 < fd1;
    lb2 = ld1 > fd0;
    fd1 *= -1;
    lb4 = ld1 > fd0;
        fb0 = !fb1;
    lb2 = lb4 || fb0;
    fd1 *= -1;
    double ld5 = 580.5912811094089;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ld5, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld1 *= -1;

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
